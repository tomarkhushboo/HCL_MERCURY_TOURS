//using @after and @before annotation : JUNIT

package com.mercury.tours;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Relative_path_Ex {
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
	
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://newtours.demoaut.com/mercurywelcome.php");
}

@After //post defined

public void closeBrowser(){
	driver.quit();
}
		

	

}
