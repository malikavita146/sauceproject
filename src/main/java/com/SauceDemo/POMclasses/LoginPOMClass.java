package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	WebDriver Drive;
	  
	  @FindBy(xpath="//input[@id='user-name']")
	  WebElement username;
	  
	  public void sendusername() 
	  {
	   username.sendKeys("standard_user");
	  }
	  
	  @FindBy(xpath="//input[@id='password']")//annotation
	  WebElement passward;
	  
	  public void sendpassward() //method
	  {
		  passward.sendKeys("secret_sauce");
	  }
	  	  
	  @FindBy(xpath="//input[@id='login-button']")
	  WebElement loginbutton;
	  
	  public void loginbutton() //method
	  {
		  loginbutton.click();
	  }
	  
	 public LoginPOMClass(WebDriver Drive)//constructor
	  {
	
		 this.Drive = Drive;
			
			//sele class
			PageFactory.initElements(Drive, this);

		 
	  }
}
