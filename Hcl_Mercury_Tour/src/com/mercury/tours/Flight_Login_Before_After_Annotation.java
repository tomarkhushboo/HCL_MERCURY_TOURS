//create program using relative path

package com.mercury.tours;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flight_Login_Before_After_Annotation {
	ChromeDriver driver; // global variable
	
@Test	
public void Sign_on_Sucessful_login() {
		
	 
	 driver.findElement(By.linkText("SIGN-ON")).click();
	 driver.findElement(By.name("userName")).sendKeys("testing");
	 driver.findElement(By.name("password")).sendKeys("testing");
	 driver.findElement(By.name("login")).click();
	 } 		
@Before //predefined

public void LaunchBrowser(){
	
	 //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	String absolutePath = System.getProperty("user.dir");
	String filePath = absolutePath+"\\Drivers"+"\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", filePath);
	
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://newtours.demoaut.com/mercurywelcome.php");
}

@After //post defined

public void closeBrowser(){
	driver.quit();
}
		

	

}
