package com.SauceDemo.TestClass;





import org.testng.Assert;

import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.HomePOMclass;

import testNgpackage.TestBaseclass;
public class TC04_VerifyAllproductFunctionality extends TestBaseclass 
{
	
	   @Test
	   public void Allproductfunctionality() 
	   {
	    HomePOMclass W1 =new HomePOMclass(Drive);
	    W1.clickallproduct();
	    log.info("select all product");
	    
        String exceptedProduct = "6";
		String actualProduct = W1.getTextFromAddToCart();
		System.out.println("actual product->"+actualProduct);
	
       Assert.assertEquals(actualProduct, exceptedProduct);
}
}