package com.gitRepo.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gitRepo.PageObjects.DeleteRepo;

public class TC_DeleteRepo_005 extends BaseClass{
	
	@Test
	public void delRepository() throws Exception
	{
		driver.navigate().to(createissueURL);
		
		DeleteRepo delrepo=new DeleteRepo(driver);
		
		delrepo.optSetting();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(delrepo.delRepoXpath()));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", delrepo.delRepoXpath());
		
		delrepo.delRepo();
		
		delrepo.deldiaBox(deleteconfirm);
		
		delrepo.delRepoFinal();
		
		Thread.sleep(5000);
		
	}

}
