package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript
{
	//"******************************Page Elements****************************************"//
	
	 //@FindBy(id="container_tasks")WebElement task;
	 @FindBy(xpath="//div[@class='title ellipsis']")WebElement addnew;
	 @FindBy(xpath="//div[@class='item createNewCustomer']")WebElement customer;
	 @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement custnametBox;
	 @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement custdescriptiontarea;
	 @FindBy(xpath="//div[text()='Create Customer']") WebElement createCustomerButton;	
	 @FindBy(xpath="//span[@class='innerHtml']") WebElement successMessageText;
	 @FindBy(xpath="//input[@placeholder='Start typing name ...']")WebElement searchbox;
	 @FindBy(xpath="//div[@class='node customerNode editable selected']//div[@class='title']")WebElement customeroption;
	 @FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']")WebElement options;
	 @FindBy(xpath="(//div[text()='ACTIONS'])[1]") WebElement actionButton;
	 @FindBy(xpath="(//div[text()='Delete'])[2]") WebElement deleteButton;
	 @FindBy(xpath="//span[contains(text(),'Delete permanently')]")WebElement delperm;
	 
	 
	 
	 
	 
	 //"****************************Page Initialization**********************************"//
	 
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
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		 {
			e.getStackTrace();
		}
	 }
	 public void entername(String customer)
	 {
		 custnametBox.sendKeys(customer);
	 }
	 public void description(String description)
	 {
		 custdescriptiontarea.sendKeys(description);
	 }
	 public void create()
	 {
		 createCustomerButton.click();
	 }
	 public String successmessage()
	 {
		 return successMessageText.getText();
	 }
	 public void cuctomeroption()
	 {
		 customeroption.click();
	 }
   public void option()
   {
	   options.click();
   }
	 public void actions()
	 {
		 actionButton.click();
	 }
	 public void delete()
	 {
		 deleteButton.click();
	 }
	 public void delconfirm()
	 {
		 delperm.click();
	 }
	 
	 
	 

}
