package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPagepomclass 
{
	WebDriver Drive;
	 @FindBy(xpath="//button[@id='finish']")
	  WebElement FinishButton ;
	  
	  public void finEle() 
	  {
		  FinishButton.click();
	  }
	  
	  public BillingPagepomclass(WebDriver Drive)//constructor
	  {
	
		 this.Drive = Drive;
			
			//sele class
			PageFactory.initElements(Drive, this);
	  }
}
