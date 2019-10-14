package com.plusoft.dao;
import java.sql.*;
import java.util.*;
import java.util.Date;

import com.plusoft.util.Convert;
import com.plusoft.util.JSON;
import com.plusoft.util.SqlHelper;
import com.plusoft.util.StringUtil;


public class DepartmentDao{
	
	public String insert(HashMap model)
    {
		String id = UUID.randomUUID().toString();
		model.put("id", id);
		
        String sql = "insert into t_department (id, name, manager, manager_name) "
                    + "values (@id, @name, @manager, @manager_name)";
        
        SqlHelper.execute(sql, model);
        return id;
    }

    public boolean update(HashMap model)
    {
        String sql = "update t_department set\n" 
                            +"name = @name, manager = @manager, manager_name = @manager_name\n"
                      +"where id = @id";

        int result = SqlHelper.execute(sql, model);
        return result > 0;
    }

    public boolean delete(String id)
    {
    	String sql = "delete from t_department where id = @id";    
    	HashMap param = new HashMap();
    	param.put("id", id);
        int result = SqlHelper.execute(sql, param);
        return result > 0;
    }

    public HashMap getById(String id)
    {
    	String sql = "select * from t_department where id = @id";
    	HashMap param = new HashMap();
    	param.put("id", id);
        return SqlHelper.querySingle(sql, param);
    }

    public ArrayList getList()
    {
    	String sql = "select * from t_department";
        return SqlHelper.query(sql, null);      
    }
}
