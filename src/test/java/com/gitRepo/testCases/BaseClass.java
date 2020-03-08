package com.gitRepo.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.gitRepo.PageObjects.LoginPage;
import com.gitRepo.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String createissueURL=readconfig.getCreateIssueURL();
	public String deleteconfirm=readconfig.setDeleteConfirm();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String newCreatedRepoName=readconfig.getCreatedRepoName();
	public String repoDescriptionDetail=readconfig.getRepoDescription();
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{	
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
			
			driver.get(baseURL);		
			
			LoginPage lp=new LoginPage(driver);
			
			lp.setUserName(username);
			
			lp.setPassword(password);
			
			lp.clickSubmit();			
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
