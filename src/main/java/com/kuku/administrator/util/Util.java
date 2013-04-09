package com.kuku.administrator.util;

import java.io.UnsupportedEncodingException;

public class Util {
	
	public static String encodeString(String string){
		
		String xml = string;
    	try {
			xml = new String(xml.getBytes("latin1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return xml;
	}

}
