package testNgpackage;import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.CartPagePOMClass;
import com.SauceDemo.POMclasses.HomePOMclass;

public class TestClass extends TestBaseclass
{
	
	@Test
	public void Loginfunctionality() 
	{
		System.out.println("Take Validation");
	    WebElement Jacket=Drive.findElement(By.xpath("(//button[text()='Add to cart'])[4]"));
	    Jacket.click();
	  	
	  	WebElement Bucket=Drive.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	  	String Actualproductselected=Bucket.getText();
	  	log.info("Product is selected");
	  	
	  	String Expectedproductselected="1";
	  	Assert.assertEquals(Actualproductselected, Expectedproductselected);
	}
	
	@Test
	public void Logoutfunctionality() 
	{
	HomePOMclass b= new HomePOMclass(Drive);
	b.menubutton();
	b.Logout();
	System.out.println("login functionality complete");
	System.out.println("apply the validation");
	String expectedTitle = "Swag Labs";    
	String actualTitle = Drive.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test
	public void Bagproductfunctionality() 
	{
    HomePOMclass b =new HomePOMclass(Drive);
    b.BagEle();
    log.info("bag product is selected");
    log.info("Take Validation");
   
    String Expectedproductselected="1";
  	WebElement Bucket=Drive.findElement(By.xpath("//a[@class='shopping_cart_link']"));
  	String Actualproductselected=Bucket.getText();
  	log.info("Product is selected");
  	Assert.assertEquals(Actualproductselected, Expectedproductselected);
	}
	
	 @Test
		public void CheckOutfunctionality() 
		{
	    HomePOMclass b= new HomePOMclass(Drive);
	    b.BagEle();
	    b.BucketEle();
	    log.info("product selected");
	    
	    CartPagePOMClass c= new CartPagePOMClass(Drive);
	    c.Checkoutbt();
	    c.Firstname1();
	    c.Lastname1();
	    c.Pinnumber();
	    log.info("Address");
		
	    log.info("apply the validation");
	     WebElement text= Drive.findElement(By.xpath("//span[text()='Checkout: Your Information']"));
	     String Expectedtext="CHECKOUT: YOUR INFORMATION";
	     String ActualText=text.getText();
	     System.out.println(ActualText);
	     Assert.assertEquals(ActualText, Expectedtext);
		}  
}

