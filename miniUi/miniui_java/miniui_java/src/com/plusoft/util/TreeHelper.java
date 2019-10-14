package com.plusoft.util;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TreeHelper {
    
    public static ArrayList list2Tree(List table, String childrenField, String idField, String parentIdField)
    {
    	ArrayList tree = new ArrayList();

        Map hash = new HashMap();
        for (int i = 0, l = table.size(); i < l; i++)
        {
            Map t = (Map)table.get(i);
            hash.put(t.get(idField), t);
        }
  
        for (int i = 0, l = table.size(); i < l; i++)
        {
            Map t = (Map)table.get(i);
            Object parentID = t.get(parentIdField);
            if (parentID == null || parentID.toString().equals("-1"))   
            {
                tree.add(t);
                continue;
            }
            Map parent = (Map)hash.get(parentID);
            if (parent == null)    
            {
                tree.add(t);
                continue;
            }
            List children = (List)parent.get(childrenField);
            if (children == null)
            {
                children = new ArrayList();
                parent.put(childrenField, children);
            }
            children.add(t);
        }
        
        
        return tree;
    }  

    public static ArrayList tree2List(List tree, String parentId, String childrenField, String idField, String parentIdField)
    {
    	ArrayList list = new ArrayList();
        for (int i = 0, len = tree.size(); i < len; i++)
        {
            Map task = (Map)tree.get(i);

            task.put(parentIdField, parentId);
            list.add(task);
        	
            List children = (List)task.get(childrenField);

            if (children != null && children.size() > 0)
            {
            	String id = task.get(idField) == null ? "" : task.get(idField).toString();
                List list2 = tree2List(children, id, childrenField, idField, parentIdField);
                list.addAll(list2);
            }
            //task.remove(childrenField);
        }
        return list;
    }
}
