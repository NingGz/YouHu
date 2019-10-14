package com.plusoft.service;

import java.util.ArrayList;

import com.plusoft.dao.EducationalDao;

public class EducationalService {

    EducationalDao dao = new EducationalDao();

    public ArrayList getList()
    {
        return dao.getList();
    }
    
}
