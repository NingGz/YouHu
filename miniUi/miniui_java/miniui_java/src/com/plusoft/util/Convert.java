package com.plusoft.util;

import java.sql.Timestamp;
import java.util.Date;

public class Convert {	
	
	public static Timestamp toTimestamp(Object o) {
		if(o == null) return null;		
		return new Timestamp(((Date)o).getTime());
	}
	
	public static String toString(Object o){
		if(o==null) return "";
		return o.toString();
	}
	public static Integer toInt(Object o){
		if(o==null)  o=0;
		
		double d = Double.parseDouble(o.toString());
		int i = 0;
		i -= d;
		return -i;		
	}
	public static Long toLong(Object o){
		if(o==null)  o=0;
		return Long.parseLong(o.toString());
	}
	public static Float toFloat(Object o){
		if(o==null)  o=0;
		return Float.parseFloat(o.toString());
	}
	public static Double toDouble(Object o){
		if(o==null)  o=0;
		return Double.parseDouble(o.toString());
	}
	public static Short toShort(Object o){
		if(o==null)  o=0;
		return Short.parseShort(o.toString());
	}
	public static Boolean toBoolean(Object o){
		if(o==null)  o=false;
		return Boolean.parseBoolean(o.toString());
	}	
	public static Character toChar(Object o){
		if(o==null)  o="";
		return (Character)o;
	}	

}
