package com.plusoft.util;

import java.sql.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oracle.sql.CLOB;

public class SqlHelper {
	
	//mysql
	private static String dbType = "MySql";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/plusoft_test?useUnicode=true&characterEncoding=GBK";
	private static String user = "root";
	private static String pwd = "";
	
	//sqlserver
	//private static String dbType = "SqlServer";
//		private static  String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
//		private static  String url="jdbc:sqlserver://localhost:1433;DatabaseName=plusoft_test";
//		private static  String user="sa";
//		private static  String pwd="";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static int execute(String sql, HashMap param) {		
		return execute(sql, param, null);
	}
	
	public static int execute(String sql, HashMap param, Connection conn) {		
		try {
			boolean isTransaction = conn != null;
			
			if(!isTransaction) conn = getConnection();
			
			PreparedStatement stmt = createPreparedStatement(conn, sql, param);		
			int count = stmt.executeUpdate();               
			stmt.close();
			
			if(!isTransaction) conn.close();			
			
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return 0;
	}
	
	public static ArrayList query(String sql, HashMap param)
	{
		ArrayList list = new ArrayList();
		try {
			Connection conn = getConnection();
			PreparedStatement stmt = createPreparedStatement(conn, sql, param);		
			ResultSet rst = stmt.executeQuery();
			list = resultSetToList(rst);
			rst.close();
			stmt.close();
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return list;		
	}	
	
	public static HashMap querySingle(String sql, HashMap param)
	{
		ArrayList list = query(sql, param);
		return list.size() == 0 ? null : (HashMap)list.get(0);
	}
	
	public static Object executeScalar(String sql, HashMap param)
    {		
		HashMap o = querySingle(sql, param);
		
		if(o != null) {
			for (Object key : o.keySet()) {
	    		Object value = o.get(key.toString());
	    		return value;
	    	}
		}
		return null;	
    }
	
	//paginate(int pageNumber, int pageSize, String select, String sqlExceptSelect, Object... paras)
	
	public static ArrayList queryPage(String sql, HashMap param, int pageIndex, int pageSize)
    {
        if (dbType.equals("MySql"))
        {
            sql += "\nlimit " + pageIndex * pageSize + "," + pageSize;
            return query(sql, param);
        }
        else
        {
            //! 非mysql暂用内存分页，不可取，实际开发中应自己编写分页SQL。
            ArrayList dataAll = query(sql, param);
            
    	    ArrayList data = new ArrayList();
    	    int start = pageIndex * pageSize, end = start + pageSize;
    	    int total = dataAll.size();    	    
    	    for (int i = start, l = end; i < l; i++)
    	    {
    	    	if(i >= total) break;	    	
    	        HashMap record = (HashMap)dataAll.get(i);
    	        data.add(record);	        
    	    }
    	    return data;
        }

        //sqlserver 2012
        //select * from 表 	OFFSET PageIndex*pagenum ROWS FETCH next pagenum rows only
    }
	
	/////////////////////////////////////////////////////////////////////////////
	private static PreparedStatement createPreparedStatement(Connection conn, String sql, HashMap param) throws Exception{
		
		List paramList = new ArrayList();
		
		if(param !=null) {
			HashMap lowerParam = new HashMap();
	    	for (Object key : param.keySet()) {
	    		Object value = param.get(key.toString());
	    		String newKey = key.toString().toLowerCase();
	    		lowerParam.put(newKey, value);
	    	}
	    	
	    	String regex = "@\\w+";
	    	Pattern mPattern = Pattern.compile(regex);
	        Matcher mMatcher = mPattern.matcher(sql);	        
	        
	        while (mMatcher.find()) {
	        	String key = mMatcher.group(0);
	        	//sql = sql.replace(key, "?");
	        	sql = sql.replaceFirst(key, "?");
	        	
	        	key = key.substring(1).toLowerCase();
	        	Object value = lowerParam.get(key);
	        	
	        	HashMap kv = new HashMap();
	        	kv.put("key", key);
	        	kv.put("value", value);
	        	paramList.add(kv);
	        	
	            //System.out.println(key);
	        }
	        //System.out.println(sql);
		}
	    
		PreparedStatement stmt = conn.prepareStatement(sql);		
		
	    int index = 1;
	    for(int i=0,l=paramList.size(); i<l; i++) {
	   		HashMap kv = (HashMap)paramList.get(i);
	   		
			Object value = kv.get("value");
			//stmt.setObject(index++, value);
			
			if (value instanceof java.util.Date) {
				stmt.setTimestamp(index, new java.sql.Timestamp(((java.util.Date)value).getTime()));
            } else if (value instanceof java.sql.Date) {				
				stmt.setDate(index, (java.sql.Date)value);
            } else if (value instanceof java.sql.Timestamp) {
            	stmt.setTimestamp(index, (java.sql.Timestamp)value);
            } else {
            	stmt.setObject(index, value);
            }
			
			index++;
			
		}
		
		return stmt;
	}
	
	public static ArrayList resultSetToList(ResultSet rs) throws Exception{    	
		ResultSetMetaData md = rs.getMetaData();
		int columnCount = md.getColumnCount();
		ArrayList list = new ArrayList();
		Map rowData;
		while(rs.next()){
	    	rowData = new HashMap(columnCount);
	    	for(int i = 1; i <= columnCount; i++)   {	 	    		
	    		Object v = rs.getObject(i);
	    		
	    		if(v != null && (v.getClass() == java.util.Date.class || v.getClass() == java.sql.Date.class)){
	    			Timestamp ts= rs.getTimestamp(i);
	    			v = new java.util.Date(ts.getTime());
	    		}else if(v != null && v.getClass() == CLOB.class){
	    			v = clob2String((CLOB)v);
	    		}
	    		rowData.put(md.getColumnName(i),   v);
	    	}
	    	list.add(rowData);	    	
		}
		return list;
	} 	
	
	private static String clob2String(CLOB clob) throws Exception {
	    return (clob != null ? clob.getSubString(1, (int) clob.length()) : null);
	}
	
	public static String createOrderSql(ArrayList sortFields, String namePrefix)
    {
        if (namePrefix == null) namePrefix = "";
        
        String sql = "";
        if (sortFields != null && sortFields.size() > 0)
        {
            for (int i = 0; i < sortFields.size(); i++)
            {
            	HashMap record = (HashMap)sortFields.get(i);
                String sortField = (String)record.get("field");
                String sortOrder = (String)record.get("dir");
                
                if (StringUtil.isNullOrEmpty(sortOrder)) sortOrder = "asc";
                
                if (i == 0)
                {
                    sql += " order by " + namePrefix + sortField + " " + sortOrder;
                }
                else
                {
                    sql += ", " + namePrefix + sortField + " " + sortOrder;
                }
            }
        }
        return sql;
    }
	
	public static void copyFrom(HashMap to, HashMap from) {		
        Iterator iter = from.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();  
            to.put(key, val);
        }
	}
}
