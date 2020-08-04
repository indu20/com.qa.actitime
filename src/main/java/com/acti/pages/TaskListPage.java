package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript
{
	//"******************************Page Elements****************************************"//
	
	 @FindBy(id="container_tasks")WebElement task;
	 @FindBy(linkText="Add New")WebElement addnew;
	 @FindBy(linkText="+ New Customer")WebElement customer;
	 @FindBy(xpath="//input[@placeholder='Enter Customer Name']")WebElement name;
	 @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement desc;
	 @FindBy(linkText="Create Customer")WebElement crt;
	 
	 
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
	 public void description()
	 {
		 desc.sendKeys();
	 }
	 public void create()
	 {
		 crt.click();
	 }
	 
   
	 
	 
	 
	 

}
