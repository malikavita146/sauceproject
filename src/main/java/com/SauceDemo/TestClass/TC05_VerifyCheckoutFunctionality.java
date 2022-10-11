package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.CartPagePOMClass;
import com.SauceDemo.POMclasses.HomePOMclass;
import com.SauceDemo.POMclasses.LoginPOMClass;
import com.SauceDemo.UtilityClass.Screenshotclass;

import testNgpackage.TestBaseclass;

public class TC05_VerifyCheckoutFunctionality extends TestBaseclass 
{
	
	    @Test
		public void CheckOutfunctionality() throws IOException
		{
	    HomePOMclass b= new HomePOMclass(Drive);
	    b.BagEle();
	    b.BucketEle();
	    System.out.println("product selected");
	    
	    CartPagePOMClass c= new CartPagePOMClass(Drive);
	    c.Checkoutbt();
	    c.Firstname1();
	    c.Lastname1();
	    c.Pinnumber();
	    System.out.println("Address");
		
	    log.info("apply the validation");
	     WebElement text= Drive.findElement(By.xpath("//span[text()='Checkout: Your Information']"));
	     String Expectedtext="CHECKOUT: YOUR INFORMATION";
	     String ActualText=text.getText();
	     System.out.println(ActualText);
	     Assert.assertEquals(ActualText, Expectedtext);
		}  
	   
}
