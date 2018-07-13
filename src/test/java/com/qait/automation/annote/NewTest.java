package com.qait.automation.annote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
 
	WebDriver driver;
	App app;
	
	
	@BeforeClass
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://hris.qainfotech.com/login.php");
		app=PageFactory.initElements(driver,App.class);
		
	}
	
	@Test
	public void testlogin()
	{
		app.login("vijayprakash","Vijay@321#");
		System.out.println("Successful login");
	}
	
	
}
