package com.plusoft.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

import com.plusoft.dao.EmployeeDao;
import com.plusoft.util.SqlHelper;

public class EmployeeService {
	EmployeeDao dao = new EmployeeDao();

    public String insert(HashMap model)
    {
        return dao.insert(model);
    }

    public boolean update(HashMap model)
    {
        return dao.update(model);
    }

    public boolean delete(String id)
    {
        return dao.delete(id);
    }

    public HashMap getById(String id)
    {
        return dao.getById(id);
    }

    public ArrayList GetList()
    {
        return dao.getList();
    }

    public ArrayList searchEmployees(String key, int pageIndex, int pageSize, ArrayList sortFields)
    {
        return dao.search(key, pageIndex, pageSize, sortFields);           
    }

    public ArrayList searchEmployees(String key, int pageIndex, int pageSize, String sortField, String sortOrder)
    {
        return dao.search(key, pageIndex, pageSize, sortField, sortOrder);
    }
    
	public HashMap searchEmployeesResult(String key, int pageIndex, int pageSize, ArrayList sortFields)  {
	    ArrayList data = searchEmployees(key, pageIndex, pageSize, sortFields);
	    int total = searchEmployeesTotal(key);
	    
	    HashMap result = new HashMap();
	    result.put("data", data);
	    result.put("total", total);		
	    return result;
	}

    public int searchEmployeesTotal(String key)
    {
        if (key == null) key = "";
        return dao.getCount("name like '%" + key + "%'");
    }

	public HashMap searchEmployeesResult(String key, int pageIndex, int pageSize, String sortField, String sortOrder) throws Exception {
	    ArrayList data = searchEmployees(key, pageIndex, pageSize, sortField, sortOrder);
	    int total = searchEmployeesTotal(key);
	    
	    HashMap result = new HashMap();
	    result.put("data", data);
	    result.put("total", total);		
	    
        //汇总信息：年龄（minAge, maxAge, avgAge）
	    HashMap ageInfo = SqlHelper.querySingle("select min(age) as minAge, max(age) as maxAge, avg(age) as avgAge from t_employee", null);            
        result.put("minAge", ageInfo.get("minAge"));
        result.put("maxAge", ageInfo.get("maxAge"));
        result.put("avgAge", ageInfo.get("avgAge"));
        
	    return result;
	}


    //这里演示了Dapper的事务如何使用。
    public boolean saveEmployees(ArrayList data)
    {
    	boolean flag = true;
    	Connection conn = SqlHelper.getConnection();    	
    	try {
    		conn.setAutoCommit(false);
    		
    		dao.setConnection(conn);
    		
    		for(int i=0,l=data.size(); i<l; i++){
		    	HashMap o = (HashMap)data.get(i);
		  		
				String id = o.get("id") != null ? o.get("id").toString() : "";
		        String state = o.get("_state") != null ? o.get("_state").toString() : "";
		        if(state.equals("added") || id.equals(""))				//新增：id为空，或_state为added
		        {
		            o.put("createtime", new Date());
		            dao.insert(o);
		        }
		        else if (state.equals("removed") || state.equals("deleted"))
		        {	            
		        	dao.delete(id);
		        }
		        else if (state.equals("modified") || state.equals(""))	//更新：_state为空，或modified
		        {	            
		        	dao.update(o);
		        }		        
		    }
    		
    		conn.commit();
    	}catch(Exception e) {    	
    		flag = false;
    		e.printStackTrace();
    		try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
    	}finally {
    		dao.setConnection(null);
    		try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}    	
    	return flag;
    }

    public ArrayList getEmployeesByDeptId(String deptId, int pageIndex, int pageSize)
    { 
        return dao.getListByDepartmentId(deptId, pageIndex, pageSize);
    }

    public int GetEmployeesByDeptIdTotal(String deptId)
    {
        return dao.getCount("dept_id ='" + deptId + "'");
    }

    public HashMap getEmployeesByDeptIdResult(String deptId, int pageIndex, int pageSize)
    {
        ArrayList data = getEmployeesByDeptId(deptId, pageIndex, pageSize);
        int total = GetEmployeesByDeptIdTotal(deptId);

        HashMap result = new HashMap();
        result.put("data", data);
        result.put("total", total);
        return result;
    }
}
