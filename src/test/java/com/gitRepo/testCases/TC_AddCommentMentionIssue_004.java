package com.gitRepo.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gitRepo.PageObjects.AddComments;
import com.gitRepo.utilities.XLUtils;

public class TC_AddCommentMentionIssue_004 extends BaseClass{
	
	@Test(dataProvider="AddCommentMentionIssueData" )
	public void submitComment(String entercomment) throws Exception 
	{	
		driver.navigate().to(createissueURL);
		
		AddComments addcomment=new AddComments(driver);
		
		addcomment.clickIssueOption();
		
		addcomment.selectIssueOne();
		
		addcomment.enterCommentOne(entercomment);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		addcomment.clickIssueLink();
		
		addcomment.clickIssueSubmit();
		
		Thread.sleep(1000);
		
		addcomment.naviIssueLink();
		
		Thread.sleep(3000);
		
		driver.navigate().to(createissueURL);
				
	}
	
	@DataProvider(name="AddCommentMentionIssueData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/gitRepo/testData/Data.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet4");
		int colcount=XLUtils.getCellCount(path,"Sheet4",1);
		
		String addcommentmentionissue[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				addcommentmentionissue[i-1][j]=XLUtils.getCellData(path,"Sheet4", i,j);//1 0
			}
				
		}
	return addcommentmentionissue;
	}
}
