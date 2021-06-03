package com.generics.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements AutuConstant
{
  public WebDriver driver;
  
	  @BeforeClass
	  public void openBrowser()
	  {
		  System.setProperty(chrome_key, chrome_value);
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get(URL);
		  
	  }
	  @AfterClass
	  public void closeBrowser()
	  {
		  //driver.quit();
	  }
  }

