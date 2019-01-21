package com.email.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @author wangming
 * @version
 * 	读取获取配置文件相关信息
 * */
public class EmailPropertiesUtil {
	private static Properties  p = System.getProperties();
	private static EmailPropertiesUtil propertiesUtil = null;
	private EmailPropertiesUtil(){
		try {
			p.load(EmailPropertiesUtil.class.getResourceAsStream("email.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key){
		if(propertiesUtil == null){
			propertiesUtil = new EmailPropertiesUtil();
		}
		return p.getProperty(key);
	}
	
	public static void clear(){
		p.clear();
	}
}
