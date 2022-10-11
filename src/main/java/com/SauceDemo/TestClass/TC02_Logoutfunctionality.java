package com.SauceDemo.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.HomePOMclass;

import testNgpackage.TestBaseclass;

public class TC02_Logoutfunctionality extends TestBaseclass
{
	@Test
	public void Logoutfunctionality() throws IOException
	{
	HomePOMclass b= new HomePOMclass(Drive);
	b.menubutton();
	b.Logout();
	log.info("login functionality complete");
	log.info("apply the validation");
	String expectedTitle = "Swag Labs";    
	String actualTitle = Drive.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	 
}
