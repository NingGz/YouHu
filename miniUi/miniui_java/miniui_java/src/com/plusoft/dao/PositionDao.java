package com.plusoft.dao;
import java.sql.*;
import java.util.*;
import java.util.Date;

import com.plusoft.util.Convert;
import com.plusoft.util.JSON;
import com.plusoft.util.SqlHelper;
import com.plusoft.util.StringUtil;


public class PositionDao{
	
    public ArrayList getList()
    {
        String sql = "select * from t_position";
        return SqlHelper.query(sql, null);      
    }

    public ArrayList getPositionsByDepartmenId(String departmentId)
    {
        String sql = "select * from t_position where dept_id = '" + departmentId + "'";
        return SqlHelper.query(sql, null); 
    }
    
}
