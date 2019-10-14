package com.plusoft.web;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import javax.servlet.http.*;

import com.plusoft.service.*;
import com.plusoft.util.*;

public class FileService extends BaseService {
	
	public FileService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		super(request, response);
	}
	
	public void LoadFolders() throws Exception
	{ 	
	    //获取提交的数据
	    String id = request.getParameter("id");
	    if(StringUtil.isNullOrEmpty(id)) id = "-1";
	  
	    //获取下一级节点
	    String sql = "select * from plus_file where folder = 1 and pid = '" + id + "' order by updatedate";
	    ArrayList folders = SqlHelper.query(sql, null);
	    
	    //判断节点，是否有子节点。如果有，则处理isLeaf和expanded。
	    for (int i = 0, l = folders.size(); i < l; i++)
	    {
	        HashMap node = (HashMap)folders.get(i);
	        String nodeId = node.get("id").toString();

	        node.put("isLeaf", false);
	        node.put("expanded", false);
	    }
	    
	    //返回处理结果
	    String json = JSON.encode(folders);
	    response.getWriter().write(json);    
	}
	public void LoadFiles() throws Exception
	{ 	
	    //获取提交的数据
	    String folderId = request.getParameter("folderId");   

	    //获取下一级节点
	    String sql = "select * from plus_file where pid = " + folderId + " and folder = 0 order by updatedate";
	    ArrayList files = SqlHelper.query(sql, null);
	    
	    //返回处理结果
	    String json = JSON.encode(files);
	    response.getWriter().write(json);    
	}
}
