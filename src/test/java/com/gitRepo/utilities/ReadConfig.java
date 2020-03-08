 package com.gitRepo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() //Constructor
	{
		File src = new File("./ConfigFiles/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL() //Method
	{
		String url=pro.getProperty("createRepoURL");
		return url;
	}
	
	public String getCreatedRepoName() //Method
	{
		String crep=pro.getProperty("newCreatedRepoName");
		return crep;
	}
	
	public String getRepoDescription() //Method
	{
		String repdes=pro.getProperty("repoDescriptionDetail");
		return repdes;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getCreateIssueURL()
	{
	String issueurl=pro.getProperty("createIssueURL");
	return issueurl;
	}
	
	public String setDeleteConfirm()
	{
	String deleteconfirm=pro.getProperty("deleteconfirm");
	return deleteconfirm;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}
}
