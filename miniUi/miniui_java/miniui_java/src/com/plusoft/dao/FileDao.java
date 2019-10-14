package com.plusoft.dao;
import java.sql.*;
import java.util.*;
import java.util.Date;

import com.plusoft.util.Convert;
import com.plusoft.util.JSON;
import com.plusoft.util.SqlHelper;
import com.plusoft.util.StringUtil;


public class FileDao{
	
	public String insert(HashMap model)
    {
		String id = UUID.randomUUID().toString();
		model.put("id", id);

        String sql = "insert into plus_file (id, name, type, size, url, pid, createdate, updatedate, folder, num) "
                    + "values (@id, @name, @type, @size, @url, @pid, @createdate, @updatedate, @folder, @num)";
        
        SqlHelper.execute(sql, model);
        return id;
    }

    public boolean update(HashMap model)
    {
        String sql = "update plus_file set\n" 
                            +"name = @name, type = @type, size = @size,\n"
                            +"url = @url, pid = @pid, createdate = @createdate,\n"
                            +"updatedate = @updatedate, folder = @folder, num = @num\n"
                      +"where id = @id";

        int result = SqlHelper.execute(sql, model);
        return result > 0;
    }

    public boolean delete(String id)
    {
        String sql = "delete from plus_file where id = @id";       
    	HashMap param = new HashMap();
    	param.put("id", id);
        int result = SqlHelper.execute(sql, param);
        return result > 0;
    }

    public HashMap getById(String id)
    {
        String sql = "select * from plus_file where id = @id";
    	HashMap param = new HashMap();
    	param.put("id", id);        
        return SqlHelper.querySingle(sql, param);
    }

    public ArrayList getList()
    {
        String sql = "select * from plus_file";
        return SqlHelper.query(sql, null);
    }
	
}
