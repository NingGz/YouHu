package com.plusoft.dao;
import java.sql.*;
import java.util.*;
import java.util.Date;

import com.plusoft.util.Convert;
import com.plusoft.util.JSON;
import com.plusoft.util.SqlHelper;
import com.plusoft.util.StringUtil;


public class EducationalDao{
	
    public ArrayList getList()
    {
        String sql = "select * from t_educational";
        return SqlHelper.query(sql, null);
    }
}
