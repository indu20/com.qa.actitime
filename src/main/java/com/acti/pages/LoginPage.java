package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;

public class LoginPage extends DriverScript
{
	 @FindBy(id="username")WebElement usernametbox;
	 @FindBy(name="pwd")WebElement pwdtbox;
	 @FindBy(id="loginButton")WebElement loginbutton;
	 @FindBy(xpath="//div[@class='atLogoImg']")WebElement actilogo;
	 @FindBy(id="keepLoggedInCheckBox")WebElement checkbox;
	 
//"*********************************************************************************************"//	 
	 public LoginPage() {
             PageFactory.initElements(driver,this);
             }
	 
	 //"****************************************************************************************"//
	 @Test
	  public void validateLoginFunction(String username,String password)
	  {
		  usernametbox.sendKeys("username");
		  pwdtbox.sendKeys("password");
		  loginbutton.click();
		  //actilogo.isDisplayed();
		  //checkbox.isEnabled();
	}
	 
	  public boolean verifyactilogo()
	  {
		boolean logo = actilogo.isDisplayed();
		return logo;
	  }
	  public boolean verifycheckbox()
	  {
		boolean check = checkbox.isEnabled();
		  return check;
	  }
	  public String verifyLoginPagetitle()
	  {
		 return driver.getTitle();
		 
		 
	  }
	 
}
