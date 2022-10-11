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

import com.SauceDemo.POMclasses.HomePOMclass;
import com.SauceDemo.POMclasses.LoginPOMClass;
import com.SauceDemo.UtilityClass.Screenshotclass;

import testNgpackage.TestBaseclass;

public class TC03_VerifyBagProductFunctionality extends TestBaseclass 
{
	

	    @Test
		public void Bagproductfunctionality() throws IOException
		{
	    HomePOMclass b =new HomePOMclass(Drive);
	    b.BagEle();
	    log.info("bag product is selected");
	    log.info("Take Validation");
	   
	    String Expectedproductselected="2";
	  	WebElement Bucket=Drive.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	  	String Actualproductselected=Bucket.getText();
	  	log.info("Product is selected");
	  	Assert.assertEquals(Actualproductselected, Expectedproductselected);
		}
	   
}