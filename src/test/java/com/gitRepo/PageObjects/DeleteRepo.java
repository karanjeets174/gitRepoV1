package com.gitRepo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteRepo {
	
WebDriver crddriver;
	
	public DeleteRepo(WebDriver rcddriver)
	{
		crddriver=rcddriver;
		PageFactory.initElements(rcddriver, this);
	}
	
	@FindBy(xpath="//*[@class='octicon octicon-gear']")
	WebElement optSetting;
	
	@FindBy(xpath="//summary[contains(text(),'Delete this repository')][@role='button']")
	WebElement delRepo;
	
	@FindBy(xpath="//h2[@id='danger-zone']")
	WebElement delXapth;
	
	@FindBy(xpath="//details-dialog[@class='Box Box--overlay d-flex flex-column anim-fade-in fast']//input[@name='verify']")
	WebElement deldiaBox;
	
	@FindBy(xpath="//button[contains(text(),'I understand the consequences, delete this reposit')]")
	WebElement delRepoFinal;
	
	public void optSetting()
	{
		optSetting.click();
	}
	
	public void delRepo()
	{
		delRepo.click();
	}
	
	public WebElement delRepoXpath()
	{
		return delXapth;
	}
	
	public void deldiaBox(String deldiabox)
	{
		deldiaBox.sendKeys(deldiabox);
	}
	
	public void delRepoFinal()
	{
		delRepoFinal.click();
	}
	
	
	
	

}
