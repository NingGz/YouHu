package com.plusoft.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.plusoft.dao.DepartmentDao;

public class DepartmentService {

	DepartmentDao dao = new DepartmentDao();

    public String insert(HashMap entity)
    {
        return dao.insert(entity);
    }

    public boolean update(HashMap entity)
    {
        return dao.update(entity);
    }

    public boolean delete(String id)
    {
        return dao.delete(id);
    }

    public HashMap getById(String id)
    {
        return dao.getById(id);
    }

    public ArrayList getList()
    {
        return dao.getList();
    }
    
}
