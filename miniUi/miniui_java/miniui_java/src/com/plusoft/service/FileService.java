package com.plusoft.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.plusoft.dao.FileDao;

public class FileService {

	FileDao dal = new FileDao();

    public String insert(HashMap entity)
    {
        return dal.insert(entity);
    }

    public boolean update(HashMap entity)
    {
        return dal.update(entity);
    }

    public boolean delete(String id)
    {
        return dal.delete(id); 
    }

    public HashMap getById(String id)
    {
        return dal.getById(id);
    }

    public ArrayList getList()
    {
        return dal.getList();
    }
    
}
