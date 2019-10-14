package com.plusoft.web;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import javax.servlet.http.*;

import com.plusoft.service.*;
import com.plusoft.util.*;

public class BaseService {
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	
	public BaseService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");		
		this.request = request;
		this.response = response;
		
		String methodName = request.getParameter("method");			
	    try{		
	    	beforeInvoke(methodName);
	    	
		    Class cls = this.getClass();   
		    Method method = cls.getMethod(methodName);   		   		    		   
		    method.invoke(this);
		    
	    }catch( Exception e){
	    	e.printStackTrace();
	        HashMap result = new HashMap();
	        result.put("success", false);
	        result.put("error", -1);
	        
	        result.put("message", e.getMessage());
	        result.put("stackTrace", e.getStackTrace());
	        String json = JSON.encode(result);
	        response.reset();
	        response.getWriter().write(json);
	    }        
	    finally
	    {
	        afterInvoke(methodName);
	    	
	    }
	}
	
	protected void beforeInvoke(String methodName) {
		
	}
	
	protected void afterInvoke(String methodName) {
		
	}
	
	public String getString(String name) {
		return request.getParameter(name);
	}
	
	public int getInt(String name) {		
		return Convert.toInt(getString(name));
	}
	
	public boolean getBoolean(String name) {
		return Convert.toBoolean(getString(name));
	}
	
	public Object getObject(String name) {
		return JSON.decode(getString(name));
	}
	
	public HashMap getHashMap(String name) {
		String s = getString(name);
		if(StringUtil.isNullOrEmpty(s)) return new HashMap();
		return (HashMap)JSON.decode(s);
	}
	
	public ArrayList getArrayList(String name) {
		String s = getString(name);
		if(StringUtil.isNullOrEmpty(s)) return new ArrayList();
		return (ArrayList)JSON.decode(s);
	}
	
	public void renderJson(Object obj) throws IOException {
		String json = JSON.encode(obj);
	    response.getWriter().write(json);
	}
	
	public void renderText(String text) throws IOException {
	    response.getWriter().write(text);
	}
	
}
