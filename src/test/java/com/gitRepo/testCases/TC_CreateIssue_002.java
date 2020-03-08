package com.gitRepo.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gitRepo.PageObjects.CreateIssue;
import com.gitRepo.utilities.XLUtils;

public class TC_CreateIssue_002 extends BaseClass
{

	@Test(dataProvider="CreateIssueData" )
	public void submitIssue(String entertitle,String enterdetail) throws Exception 
	{	
		driver.navigate().to(createissueURL);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		CreateIssue createissue=new CreateIssue(driver);
		
		createissue.clickIssueOption();
		
		createissue.clickNewIssue();
		
		createissue.enterIssueTitle(entertitle);
		
		createissue.clickWriteOpt();
		
		createissue.enterIssueDetail(enterdetail);
		
		createissue.clickIssueSubmit();
				
	}
	
	@DataProvider(name="CreateIssueData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/gitRepo/testData/Data.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet2");
		int colcount=XLUtils.getCellCount(path,"Sheet2",1);
		
		String createissuedata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				createissuedata[i-1][j]=XLUtils.getCellData(path,"Sheet2", i,j);//1 0
			}
				
		}
	return createissuedata;
	}

}
