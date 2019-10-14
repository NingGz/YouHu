package com.plusoft.web;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.DriverManager;
import java.util.*;
import javax.servlet.http.*;

import com.mysql.jdbc.Connection;
import com.plusoft.service.*;
import com.plusoft.util.*;

public class AjaxService extends BaseService {
	
	public AjaxService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		super(request, response);
	}
	
	
	protected void beforeInvoke(String methodName) {
		
	}
	
	protected void afterInvoke(String methodName) {
		
	}
	
	public void SearchEmployees() throws Exception
	{
	    String key = getString("key");
	    int pageIndex = getInt("pageIndex");
	    int pageSize = getInt("pageSize");    
	    String sortField = getString("sortField");
	    String sortOrder = getString("sortOrder");
	    
	    HashMap result = new EmployeeService().searchEmployeesResult(key, pageIndex, pageSize, sortField, sortOrder);	    
	    renderJson(result);
	}

	public void SaveEmployees() throws Exception
	{
	    ArrayList data = getArrayList("data");
	    new EmployeeService().saveEmployees(data);
	}
		
	public void RemoveEmployees() throws Exception
	{
	    String id = getString("id");       
	    new EmployeeService().delete(id);
	}
	public void GetEmployee() throws Exception
	{
	    String id = getString("id");
	    HashMap o = new EmployeeService().getById(id); 
	    renderJson(o);
	}
	
	public void GetDepartments() throws Exception
	{
	    ArrayList data = new DepartmentService().getList();
	    renderJson(data);
	}
	
	public void GetPositions() throws Exception
	{
	    ArrayList data = new PositionService().getList();	    
	    renderJson(data);
	}
	public void GetEducationals() throws Exception
	{
	    ArrayList data = new EducationalService().getList();
	    renderJson(data);
	}
	public void GetPositionsByDepartmenId() throws Exception
	{
	    String id = getString("id");
	    ArrayList data = new PositionService().getPositionsByDepartmenId(id);	  
	    renderJson(data);
	}

	public void GetDepartmentEmployees() throws Exception
	{
	    String dept_id = getString("dept_id");
	    int pageIndex = getInt("pageIndex");
	    int pageSize = getInt("pageSize");

	    HashMap result = new EmployeeService().getEmployeesByDeptIdResult(dept_id, pageIndex, pageSize);
	    renderJson(result);
	}


//	public void SaveDepartment() throws Exception
//	{
//	    String departmentsStr = getString("departments");
//	    
//	    ArrayList departments = (ArrayList)JSON.decode(departmentsStr);
//	    
//	    for(int i=0,l=departments.size(); i<l; i++){
//	    	HashMap d = (HashMap)departments.get(i);  		
//	    	new EmployeeService().UpdateDepartment(d);
//	    }
//	}

	/////////////////////////////
	public void FilterCountrys() throws Exception
	{
	    String key = getString("key");
	    String value = getString("value");
		
	    //建立value的快速哈希索引，便于快速判断是否已经选择
	    String[] values = value.split(",");
	    HashMap valueMap = new HashMap();
	    for(int i=0,l=values.length; i<l; i++){
	        String id = values[i];
	        valueMap.put(id, "1");
	    }

	    //获取数据 
	    String path = request.getSession().getServletContext().getRealPath("/");    
	    
	    
	    String file = path + "/demo/data/countrys.txt";
	    String s = FileHelper.read(file);
	    ArrayList data = (ArrayList)JSON.decode(s);

	    //1）去除已经选择的记录
	    for (int i = data.size() - 1; i >= 0; i--)
	    {
	        HashMap o = (HashMap)data.get(i);
	        String id = o.get("id").toString();
	        if (valueMap.get(id) != null)
	        {
	            data.remove(i);
	        }
	    }


	    //2）根据名称查找
	    ArrayList result = new ArrayList();
	    for (int i = 0, l = data.size(); i < l; i++)
	    {
	        HashMap o = (HashMap)data.get(i);
	        String text = o.get("text").toString();
	        if (StringUtil.isNullOrEmpty(key) || text.toLowerCase().indexOf(key.toLowerCase()) != -1)
	        {
	            result.add(o);
	        }
	    }

	    //返回JSON数据	    
	    renderJson(result);
	}
	public void FilterCountrys2() throws Exception
	{
	    String key = getString("key");
	    String value = getString("value");
		
	    //获取数据 
	    String path = request.getSession().getServletContext().getRealPath("/");    
	    
	    
	    String file = path + "/demo/data/countrys.txt";
	    String s = FileHelper.read(file);
	    ArrayList data = (ArrayList)JSON.decode(s);


	    //根据名称查找
	    ArrayList result = new ArrayList();
	    for (int i = 0, l = data.size(); i < l; i++)
	    {
	        HashMap o = (HashMap)data.get(i);
	        String text = o.get("text").toString();
	        if (StringUtil.isNullOrEmpty(key) || text.toLowerCase().indexOf(key.toLowerCase()) != -1)
	        {
	            result.add(o);
	        }
	    }
	    
	    renderJson(result);
	}


	public void SearchEmployeesByMultiSort() throws Exception
	{ 		
	    //查询条件
	    String key = getString("key");
	    //分页
	    int pageIndex = getInt("pageIndex");
	    int pageSize = getInt("pageSize");        	    
	    //字段排序
	    ArrayList sortFields = getArrayList("sortFields");
	    	    
	    HashMap result = new EmployeeService().searchEmployeesResult(key, pageIndex, pageSize, sortFields);

	    renderJson(result);
	    
	}

	public void SearchEmployeesByJsonP() throws Exception
	{ 		
	    //查询条件
	    String key = getString("key");
	    //分页
	    int pageIndex = Integer.parseInt(getString("pageIndex"));
	    int pageSize = Integer.parseInt(getString("pageSize"));        
	    //字段排序
	    String sortField = getString("sortField");
	    String sortOrder = getString("sortOrder");
		
	    HashMap result = new EmployeeService().searchEmployeesResult(key, pageIndex, pageSize, sortField, sortOrder);
	    String json = JSON.encode(result);

	    String jsoncallback = getString("jsoncallback");
	    renderText(jsoncallback +"("+json+")");
	}
	
	
	//////////////////////////////////////////////
	
}
