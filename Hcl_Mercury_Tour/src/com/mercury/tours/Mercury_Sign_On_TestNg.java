package com.mercury.tours;

import org.testng.annotations.Test;

import junit.textui.TestRunner;

import org.testng.annotations.BeforeTest;
import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;

public class Mercury_Sign_On_TestNg {
	ChromeDriver driver;
  @Test
  public void Sign_On() {
	  
	  driver.findElement(By.linkText("SIGN-ON")).click();
		 driver.findElement(By.name("userName")).sendKeys("testing");
		 driver.findElement(By.name("password")).sendKeys("testing");
		 driver.findElement(By.name("login")).click();
  }
  @BeforeTest
  public void LaunchBrowser() {
	  String absolutePath = System.getProperty("user.dir");
		String filePath = absolutePath+"\\Drivers"+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filePath);
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		
		 
  }

  @AfterTest
  public void CloseBrowser() {
		driver.quit();
  }

}
