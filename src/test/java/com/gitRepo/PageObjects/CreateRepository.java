package com.gitRepo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRepository {
	
	WebDriver crdriver;
	
	public CreateRepository(WebDriver rcdriver)
	{
		crdriver=rcdriver;
		PageFactory.initElements(rcdriver, this);
	}
	
	@FindBy(id="repository_name")
	WebElement repName;
	
	@FindBy(id="repository_description")
	WebElement repDescrip;
	
	@FindBy(xpath="//button[@type='submit'][@class='btn btn-primary first-in-line']")
	WebElement createButton;
	
	public void setRepoName(String repname)
	{
		repName.sendKeys(repname);
	}
	
	public void setDescription(String repdes)
	{
		repDescrip.sendKeys(repdes);
	}
	
	public void clickCreate()
	{
		createButton.click();
	}
	
	public WebElement waitXpath()
	{
		return createButton;
	}

}
