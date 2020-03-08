package com.gitRepo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateIssue {
	
WebDriver cridriver;
	
	public CreateIssue(WebDriver rcidriver)
	{
		cridriver=rcidriver;
		PageFactory.initElements(rcidriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Issues')]")
	WebElement optIssue;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement creNewIssue;
	
	@FindBy(xpath="//input[@id='issue_title']")
	WebElement enterTitle;
	
	@FindBy(xpath="//button[contains(@class,'px-3 px-sm-6 px-md-3 flex-1 flex-md-auto')]")
	WebElement clickIssueWriteOpt;
	
	@FindBy(xpath="//textarea[@id='issue_body']")
	WebElement enterIssueDetails;
	
	@FindBy(xpath="//button[@type='submit'][@class='btn btn-primary']")
	WebElement clickIssueSubmitButton;
	
	public void clickIssueOption()
	{
		optIssue.click();
	}
	
	public void clickNewIssue()
	{
		creNewIssue.click();
	}
	
	public void enterIssueTitle(String entertitle)
	{
		enterTitle.sendKeys(entertitle);
	}
	
	public void clickWriteOpt()
	{
		clickIssueWriteOpt.click();
	}
	
	public void enterIssueDetail(String enterdetail)
	{
		enterIssueDetails.sendKeys(enterdetail);
	}
	
	public void clickIssueSubmit()
	{
		clickIssueSubmitButton.click();
	}
	
	/*public WebElement waitXpath()
	{
		return createButton;
	}*/

}
