package com.SauceDemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotclass 
{
	public static void takesscreenshot(WebDriver Drive,String name) throws IOException, InterruptedException 
	{

		Date D = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(D);
		Thread.sleep(3000);
		TakesScreenshot x=(TakesScreenshot)Drive;
		File sourcefile=x.getScreenshotAs(OutputType.FILE);
		File myfile=new File("./Screenshotfolder\\SauceDemo04thjuneBatch"+name+date+".jpg");
		FileHandler.copy(sourcefile, myfile);
		
	}
}
