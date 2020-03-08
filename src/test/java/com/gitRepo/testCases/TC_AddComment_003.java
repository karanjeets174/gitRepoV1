package com.gitRepo.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gitRepo.PageObjects.AddComments;
import com.gitRepo.utilities.XLUtils;

public class TC_AddComment_003 extends BaseClass{
	
	@Test(dataProvider="AddCommentData" )
	public void submitComment(String entercomment) throws Exception 
	{	
		driver.navigate().to(createissueURL);
		
		AddComments addcomment=new AddComments(driver);
		
		addcomment.clickIssueOption();
		
		addcomment.selectIssueOne();
		
		addcomment.enterCommentOne(entercomment);
		
		addcomment.clickIssueSubmit();
		
		Thread.sleep(2000);
		
		driver.navigate().to(createissueURL);
				
	}
	
	@DataProvider(name="AddCommentData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/gitRepo/testData/Data.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet3");
		int colcount=XLUtils.getCellCount(path,"Sheet3",1);
		
		String addcommentdata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				addcommentdata[i-1][j]=XLUtils.getCellData(path,"Sheet3", i,j);//1 0
			}
				
		}
	return addcommentdata;
	}

}
