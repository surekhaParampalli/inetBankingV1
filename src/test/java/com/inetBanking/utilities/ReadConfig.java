package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("Baseurl");
		return url;

	}

	public String getUserName() {
		String uname = pro.getProperty("UserName");
		return uname;
	}

	public String getPassword() {
		String pwd = pro.getProperty("password");
		return pwd;
	}
	public String getchromePath()
	{
		String path=pro.getProperty("chromepath");
		return path;
	}
	public String getFirefoxPath()
	{
		String path=pro.getProperty("firefoxpath");
		return path;
	}

	
}
