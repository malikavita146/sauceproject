package testNgpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMclasses.LoginPOMClass;


public class TestBaseclass
{
public WebDriver Drive;
 public Logger log= Logger.getLogger("SauceDemo04thjuneBatch");

@Parameters("browserName")
@BeforeMethod
public void setUP(String browserName) throws IOException
{
  
	if(browserName.equals("chrome"))
  {
System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe");
Drive=new ChromeDriver();
  }
 else
 {
 System.setProperty("webdriver.edge.driver","./DriverFiles\\edgedriver.exe");
 Drive=new EdgeDriver();
 }
PropertyConfigurator.configure("Log4j.properties");  
log.info("browser is opened");
Drive.manage().window().maximize();
System.out.println("browser is maximized");
Drive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
Drive.get("https://www.saucedemo.com/inventory.html");
log.info("URL is open");
//takes a screenshot
//Screenshotclass.takesscreenshot(Drive,"ss1");

LoginPOMClass a = new LoginPOMClass(Drive);
a.sendusername();
a.sendpassward();
a.loginbutton();
log.info("login functionality complete");
}

//takes a screenshot


@AfterMethod
public void teardown()
{
Drive.quit();
log.info("browser is closed");
log.info("end of Program");
  }
}
