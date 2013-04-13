package com.kuku.administrator.util;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;

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
	
	public static boolean validateEmail(String email){
		
		String ATOM = "[a-z0-9!#$%&'*+/=?^_`{|}~-]";
		String DOMAIN = "(" + ATOM + "+(\\." + ATOM + "+)*";
		String IP_DOMAIN = "\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\]";

		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(
				"^" + ATOM + "+(\\." + ATOM + "+)*@"
						+ DOMAIN
						+ "|"
						+ IP_DOMAIN
						+ ")$",
				java.util.regex.Pattern.CASE_INSENSITIVE
		);
		
		Matcher m = pattern.matcher(email);
		return m.matches();		
	}
	
	public static Date converStringToDate(String date){
		
		Date d = null;
		String [] block = date.split("/");
		String finalDate = block[2]+"-"+block[1]+"-"+block[0];
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			d = dateFormat1.parse(finalDate);
						
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return d;
		
	}

}
