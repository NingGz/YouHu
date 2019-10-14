package com.plusoft.web;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import javax.servlet.http.*;

import com.plusoft.service.*;
import com.plusoft.util.*;

public class TreeService extends BaseService {
	
	public TreeService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		super(request, response);
	}
	
	public void LoadTree() throws Exception
	{ 	
	    
	    String sql = "select * from plus_file order by num";
	    ArrayList folders = SqlHelper.query(sql, null);
	    
	    String json = JSON.encode(folders);
	    response.getWriter().write(json);    
	}
	
	public void LoadNodes() throws Exception
	{ 	
	    //获取提交的数据
	    String id = request.getParameter("id");
	    if(StringUtil.isNullOrEmpty(id)) id = "-1";

	    //获取下一级节点
	    String sql = "select * from plus_file where pid = '" + id + "' order by num";
	    ArrayList folders = SqlHelper.query(sql, null);
	    
	    //判断节点，是否有子节点。如果有，则处理isLeaf和expanded。
	    for (int i = 0, l = folders.size(); i < l; i++)
	    {
	        HashMap node = (HashMap)folders.get(i);
	        String nodeId = node.get("id").toString();

	        String sql2 = "select * from plus_file where pid = '" + nodeId + "' order by num";
	        ArrayList nodes = SqlHelper.query(sql2, null);
			
	        if (nodes.size() > 0)
	        {
	            node.put("isLeaf", false);
	            node.put("expanded", false);
	        }
	    }
	    
	    //返回处理结果
	    String json = JSON.encode(folders);
	    response.getWriter().write(json);    
	}

	public void SaveTree()throws Exception
	{
	    String dataJSON = request.getParameter("data");
	    String removedJSON = request.getParameter("removed");
	    ArrayList tree = (ArrayList)JSON.decode(dataJSON);
	    ArrayList removed = (ArrayList)JSON.decode(removedJSON);
		
	    //树形转换为列表
	    ArrayList list = TreeHelper.tree2List(tree, "-1", "children", "id", "pid");
	    
	    //生成id和num
	    for(int i = 0,l = list.size();i<l;i++){
	        HashMap node = (HashMap)list.get(i);
	        if(node.get("id") == null || node.get("id").toString().equals("")){
	            String UID = UUID.randomUUID().toString();
	            node.put("id",UID);
	        }
	        node.put("num",i);
	    }
	    
	    //生成pid
	    list = TreeHelper.tree2List(tree, "-1", "children", "id", "pid");
	    
	    // Add/Update/Move Node
	    com.plusoft.service.FileService fileService = new com.plusoft.service.FileService();
	    
	    for(int i=0,l=list.size();i<l;i++){
	           HashMap node = (HashMap)list.get(i);           
	           String state = node.get("_state") == null ? "" : node.get("_state").toString();           
	           if(state .equals("added"))
	           {	                
	        	   fileService.insert(node);
	           }else{
	        	   fileService.update(node);   
	           }
	    }
	    // Remove Node
	    if(removed != null)
	    {
	           for(int j =0 ,len = removed.size();j<len;j++)
	           {
	                HashMap node = (HashMap)removed.get(j);
	                String id = Convert.toString(node.get("id"));	                
	                fileService.delete(id);
	           }
	    }
	}



	public void FilterTree()throws Exception
	{
		ArrayList data = new ArrayList();
	    
		//获取查询参数
	    String text = request.getParameter("name").toLowerCase();
	    
	    //获取整个树数据
	    String sql = "select * from plus_file order by num, updatedate";
	    ArrayList nodes = SqlHelper.query(sql, null);
	    
	    //找出符合查询条件的节点
	    for(int i=0;i<nodes.size();i++){
	        HashMap node = (HashMap)nodes.get(i);
	        
	        String name = node.get("name") == null ? "" : node.get("name").toString().toLowerCase();

	        if(name.indexOf(text) > -1){
	        	data.add(node);
	            
	        	//加入父级所有节点
	            String pid = node.get("pid").toString();
	            if(!pid.equals("-1")){
	                ArrayList data2 = SearchParentNode(pid,nodes);
	                data.addAll(data2);
	            }
	        }
	    }
	    
	    //记录哈希
	    HashMap idMaps = new HashMap();
	    for(int i= data.size()-1;i>=0;i--){
	        HashMap node = (HashMap)data.get(i);  
	        String id = node.get("id").toString();
	        if(idMaps.get(id) == null){
	            idMaps.put(id,node);
	        }
	    }

        //重新生成
        data = new ArrayList();
        for (int i = 0, l = nodes.size(); i < l; i++)
        {
        	HashMap node = (HashMap)nodes.get(i);
            String id = node.get("id").toString();
            if (idMaps.get(id) != null)
            {
                data.add(node);
            }
        }
        
	    
	  //返回JSON
	    String dataJson = JSON.encode(data);
	    response.getWriter().write(dataJson);    
	}

	public ArrayList SearchParentNode(String pid,ArrayList nodes)throws Exception
	{
	    ArrayList data = new ArrayList();
	    for(int i=0;i<nodes.size();i++){
	        HashMap node = (HashMap)nodes.get(i);
	        if(node.get("id").toString().equals(pid)){
	            data.add(node);
	            if(!node.get("pid").toString().equals( "-1")){
	                ArrayList data2 = SearchParentNode(node.get("pid").toString(),nodes);
	                data.addAll(data2);
	            }
	        }
	    }
	    return data;
	}
}
