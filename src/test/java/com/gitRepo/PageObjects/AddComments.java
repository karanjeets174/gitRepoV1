package com.gitRepo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddComments {
	
WebDriver crcdriver;
	
	public AddComments(WebDriver rccdriver)
	{
		crcdriver=rccdriver;
		PageFactory.initElements(rccdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Issues')]")
	WebElement optIssue;
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
	WebElement issueOne;
	
	@FindBy(xpath="//textarea[@id='new_comment_field']")
	WebElement enterComment;
	
	@FindBy(xpath="//button[contains(text(),'Comment')]")
	WebElement clickCommentSubmitButton;
	
	@FindBy(xpath="//li[@role='option'][@data-value='1']")
	WebElement clickIssueLink;
	
	@FindBy(xpath="//td[contains(@class,'js-comment-body')]//a[@class='issue-link js-issue-link'][contains(text(),'#1')]")
	WebElement naviIssueLink;
	
	
	public void clickIssueOption()
	{
		optIssue.click();
	}
	
	public void selectIssueOne()
	{
		issueOne.click();
	}
	
	public void enterCommentOne(String entercomment)
	{
		enterComment.sendKeys(entercomment);
	}
	
	public void clickIssueSubmit()
	{
		clickCommentSubmitButton.click();
	}
	
	public void clickIssueLink()
	{
		clickIssueLink.click();
	}
	
	public void naviIssueLink()
	{
		naviIssueLink.click();
	}

}
