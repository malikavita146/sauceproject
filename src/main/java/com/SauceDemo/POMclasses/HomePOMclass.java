package com.SauceDemo.POMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMclass
{
//Declare globally
WebDriver Drive;
private Select s;
//
@FindBy(xpath="//button[@id='react-burger-menu-btn']")
WebElement menubutton1;

public void menubutton() 
{
	  menubutton1.click();
}

@FindBy(xpath="//a[text()='Logout']")//annotation
WebElement logout;

public void Logout() //method
{
	  logout.click();
}

@FindBy(xpath="(//button[text()='Add to cart'])[1]")
WebElement Bag ;

public void BagEle() 
{
	  Bag.click(); 
}

@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement Addtocart ;

public void BucketEle() 
{
	Addtocart.click();
}

public String getTextFromAddToCart()
{
	String totalProducts= Addtocart.getText();
	return totalProducts;
}
//allproduct
@FindBy(xpath="(//button[text()='Add to cart'])")
List<WebElement> Allproduct;

public void clickallproduct()
{
	for(WebElement W1:Allproduct)
	{
		W1.click();
	}
	}
//filter
@FindBy(xpath="//select[@class='product_sort_container']")
private WebElement Dropdown;
public void productSort()
{
	  Dropdown.click();
	  s.selectByValue("lohi");	
}	  
public HomePOMclass(WebDriver Drive)
{
	this.Drive = Drive;
	PageFactory.initElements( Drive,this);
}
}
