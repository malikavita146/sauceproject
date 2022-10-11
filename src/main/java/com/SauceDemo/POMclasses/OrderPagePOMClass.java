package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPagePOMClass 
{
	WebDriver Drive;
	 @FindBy(xpath="//button[@id='back-to-products']")
	  WebElement BacktoorderButton ;
	  
	  public void OrderEle() 
	  {
		  BacktoorderButton.click();
	  }
	  
	  public OrderPagePOMClass(WebDriver Drive)//constructor
	  {
	
		 this.Drive = Drive;
			
			//sele class
			PageFactory.initElements(Drive, this);
	  }
}
