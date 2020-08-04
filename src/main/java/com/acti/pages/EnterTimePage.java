package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

/*Script Name : Enter Time Page
  Created By : indu
  Date Created:07/03/20
  Verified By:Shantosh*/

public class EnterTimePage extends DriverScript 

{          
	//"**************************Page Elements***************************************"//
            @FindBy(id="container_tasks")WebElement Taskmenu;
			@FindBy(xpath="//a[@class='logout']")WebElement logout;
			
	//"**************************Page Initialization***************************************"//
 public EnterTimePage() 
 {
	 PageFactory.initElements(driver,this);
 }
//"*******************************Page Actions*********************************************************"//
 public void clickTaskmenu()
 {
	 Taskmenu.click();
 }
 
 public void clicklogout()
 {
	 logout.click();
 }
}

   
  
 


	
	
			
	


   