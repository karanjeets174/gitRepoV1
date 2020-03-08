package com.gitRepo.testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gitRepo.PageObjects.CreateRepository;

public class TC_CreateRepo_001 extends BaseClass { 
	
	@Test
	public void createRepo()
	{
		
		CreateRepository creRepo=new CreateRepository(driver);
		
		creRepo.setRepoName(newCreatedRepoName);
		
		creRepo.setDescription(repoDescriptionDetail);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(creRepo.waitXpath()));
		
		creRepo.clickCreate();
		
	}

}
