package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass 
{
	WebDriver Drive;
	 @FindBy(xpath="//button[@id='checkout']")
	  WebElement Checkout ;
	  
	  public void Checkoutbt() 
	  {
		  Checkout.click();
	  }
	  
	  @FindBy(xpath="//input[@id='first-name']")
	  WebElement Firstname ;
	  
	  public void Firstname1() 
	  {
		Firstname.sendKeys("Kavita");
	  }
	  
	  @FindBy(xpath="//input[@id='last-name']")
	  WebElement lastname ;
	  
	  public void Lastname1() 
	  {
		  lastname.sendKeys("Mahajan");
	  }
	  
	  @FindBy(xpath="//input[@id='postal-code']")
	  WebElement pincode ;
	  
	  public void Pinnumber() 
	  {
		  pincode.sendKeys("424209");
	  }
	  
	  @FindBy(xpath="//input[@id='continue']")
	  WebElement Continue12 ;
	  
	  public void Continuebt() 
	  {
		  Continue12.click();  
	  }
	  
	  public CartPagePOMClass(WebDriver Drive)//constructor
	  {
	
		 this.Drive = Drive;
			
			//sele class
			

		PageFactory.initElements(Drive, this);
	  }  
}
