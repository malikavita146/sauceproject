package com.SauceDemo.TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testNgpackage.TestBaseclass;

public class TC01_Loginfunctionality extends TestBaseclass
{
	

	    @Test
		public void Loginfunctionality() 
		{
	 log.info("take validation");
	   //System.out.println("Take Validation");
	    WebElement Jacket=Drive.findElement(By.xpath("(//button[text()='Add to cart'])[4]"));
	    Jacket.click();
	  	
	  	WebElement Bucket=Drive.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	  	String Actualproductselected=Bucket.getText();
	  	System.out.println("Product is selected");
	  	
	  	String Expectedproductselected="1";
	  	Assert.assertEquals(Actualproductselected, Expectedproductselected);
		}
	   
}
