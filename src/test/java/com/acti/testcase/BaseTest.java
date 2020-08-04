package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskListPage;

public class BaseTest extends DriverScript
{

	LoginPage loginpage;
	EnterTimePage entertimepage;
	TaskListPage taskpage;

	public BaseTest() 
	   {
		  super(); //Super keyword is used to call the parent class constructor
		   
	  }
	
	@BeforeMethod
    public void beforeTest()
    {
       initBrowser();
       loginpage = new LoginPage();
	   entertimepage = new EnterTimePage();
	    taskpage = new TaskListPage();
	   
    }

     @AfterMethod
    public void tearDown()
    {
    	driver.close();
    }
}
