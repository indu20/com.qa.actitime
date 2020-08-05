package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript
{
	//"******************************Page Elements****************************************"//
	
	 //@FindBy(id="container_tasks")WebElement task;
	 @FindBy(xpath="//div[@class='title ellipsis']")WebElement addnew;
	 @FindBy(xpath="//div[@class='item createNewCustomer']")WebElement customer;
	 @FindBy(xpath="//input[@placeholder='Enter Customer Name']")WebElement name;
	 @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement desc;
	 @FindBy(xpath="//div[(text(),'Create Customer']")WebElement crt;
	 
	 
	 //"****************************Page Initialization*********************************************************"//
	 
	  public TaskListPage()
	  {
		  PageFactory.initElements(driver,this);
	  }
	//"****************************Page Actions****************************************************************************"//
	 
	  public void clickaddnewbutton()
	  {
		  addnew.click();
	  }
	 public void clicknewcustomer()
	 {
		 customer.click();
	 }
	 public void entername(String customer)
	 {
		 name.sendKeys(customer);
	 }
	 public void description(String description)
	 {
		 desc.sendKeys(description);
	 }
	 public void create()
	 {
		 crt.click();
	 }
	 
   
	 
	 
	 
	 

}
