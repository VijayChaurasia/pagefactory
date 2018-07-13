package com.qait.automation.annote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
   public App(WebDriver driver)
   {
	   this.driver=driver;
   }
   @FindBy(how=How.ID,using="txtUserName")
   WebElement userentry;
   
   @FindBy(how=How.ID,using="txtPassword")
   WebElement password;
   
   @FindBy(how=How.NAME,using="Submit")
   WebElement submit;
   
   public void login(String user,String pass)
   {
	   userentry.sendKeys(user);
	   password.sendKeys(pass);
	   submit.click();
	   
   }
}
