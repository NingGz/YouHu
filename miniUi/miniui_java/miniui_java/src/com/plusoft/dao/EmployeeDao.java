package com.plusoft.dao;
import java.sql.*;
import java.util.*;
import java.util.Date;
import com.plusoft.util.*;


public class EmployeeDao{
	
	Connection conn;
	public void setConnection(Connection conn) {
		this.conn = conn;
	}
	
	String selectSql = "select a.*, b.name dept_name, c.name position_name, d.name educational_name \n"
			 +"from t_employee a \n"
			 +"left join t_department b \n"
			 +"on a.dept_id = b.id \n"
			 +"left join t_position c \n"
			 +"on a.position = c.id \n"
			 +"left join t_educational d \n"
			 +"on a.educational = d.id \n";
	
	public String insert(HashMap model) {
		String id = UUID.randomUUID().toString();
		model.put("id", id);
		model.put("createtime", new Date());
		
        String sql = "insert into t_employee (id, loginname, name, age, birthday, dept_id, position, gender, married, salary, educational, country, city, remarks, school, createtime, email) "
                    + "values (@id, @loginname, @name, @age, @birthday, @dept_id, @position, @gender, @married, @salary, @educational, @country, @city, @remarks, @school, @createtime, @email)";
        
        SqlHelper.execute(sql, model, conn);
        return id;
	}
	
	public boolean update(HashMap model)
    {
        //这里先获取数据库旧有对象，然后更新。
        String id = Convert.toString(model.get("id"));
        HashMap old = getById(id);
        if (old == null) return false;
        //将新的数据拷贝到旧对象上
        SqlHelper.copyFrom(old, model);
        model = old;
        
        //更新操作
        String sql = "update t_employee set\n" 
                            + "loginname = @loginname, name = @name, age = @age, birthday = @birthday,\n" 
                            + "dept_id = @dept_id, position = @position, gender = @gender, married = @married, \n"
                            + "salary = @salary, educational = @educational, country = @country, city = @city, \n"
                            + "remarks = @remarks, school = @school, createtime = @createtime, email = @email \n"
                 	+ "where id = @id";
        
        int result = SqlHelper.execute(sql, model, conn);
        return result > 0;
    }

    public boolean delete(String id)
    {
        String sql = "delete from t_employee where id = @id";          
        HashMap param = new HashMap();
    	param.put("id", id);
        int result = SqlHelper.execute(sql, param, conn);
        return result > 0;
    }

    public HashMap getById(String id)
    {
    	String sql = selectSql + " where a.id = @id";
        
    	HashMap param = new HashMap();
    	param.put("id", id);
        return SqlHelper.querySingle(sql, param);
    }

    public ArrayList getList()
    {
        String sql = selectSql;
        return SqlHelper.query(sql, null);
    }

    public ArrayList search(String key, int pageIndex, int pageSize, String sortField, String sortOrder) 
    {
        ArrayList sortFields = new ArrayList();        
        if (!StringUtil.isNullOrEmpty(sortField)) {        	        
	        HashMap p = new HashMap();
	        p.put("field", sortField);
	        p.put("dir", sortOrder);
	        sortFields.add(p);
        }
        
        return search(key, pageIndex, pageSize, sortFields);
    }	
    
    public ArrayList search(String key, int pageIndex, int pageSize, ArrayList sortFields)
    {
        if (key == null) key = "";

        String sql = selectSql + "\nwhere a.name like '%" + key + "%'";

        if (sortFields != null && sortFields.size() > 0)
        {
            sql += SqlHelper.createOrderSql(sortFields, "a.");
        }
        else
        {
            sql += "\norder by a.createtime desc";
        }

        return SqlHelper.queryPage(sql, null, pageIndex, pageSize);
    }

    public int getCount(String where )
    {
        String sql = "select count(1) from t_employee";
        if (!StringUtil.isNullOrEmpty(where))
        {
            sql += " where " + where;
        }
        
        return Convert.toInt( SqlHelper.executeScalar(sql, null)); 
    }

    public ArrayList getListByDepartmentId(String departmentId, int pageIndex, int pageSize)
    {
        String sql = selectSql + "where a.dept_id = @id";
        HashMap param = new HashMap();
        param.put("id", departmentId);
        return SqlHelper.queryPage(sql, param, pageIndex, pageSize);
    }	
	    
}
