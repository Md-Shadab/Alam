package com.accuride.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getsignupemail()
	{
	String signupemail=pro.getProperty("signupemail");
	return signupemail;
	}
	
	public String getsignupPassword()
	{
	String signuppassword=pro.getProperty("signuppassword");
	return signuppassword;
	}
	
	public String getsignupconfirmpassword() {
		
		String signupconfirmpassword=pro.getProperty("signupconfirmpassword");
		return signupconfirmpassword;
	}
	
	public String getsearchproductname() {
		String productnameforsearch=pro.getProperty("productnameforsearch");
		return productnameforsearch;
	}
	
	public String getFirstname()
	{
	String fstname=pro.getProperty("firstname");
	return fstname;
	}
	
	public String getLastname()
	{
	String lstname=pro.getProperty("lastname");
	return lstname;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

	
}


