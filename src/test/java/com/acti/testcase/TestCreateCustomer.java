package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;



public class TestCreateCustomer extends BaseTest
{      
	
	  @Test
      public void TestCreateCustomer() throws Exception 
      {
		  logger=extent.createTest("Test create New customer In TaskPage"); 
    	  loginpage.validateLoginFunction("admin","manager");
    	  logger.log(Status.PASS,"Login was Successful");
    	  entertimepage.clickTaskmenu();
    	  logger.log(Status.INFO,"clicked Task Menu");
    	  taskpage.clickaddnewbutton();
    	  logger.log(Status.INFO,"Clicked add Newbutton");
    	  taskpage.clicknewcustomer();
    	  logger.log(Status.INFO,"Clicked new customer");
    	  taskpage.entername("Testing customer");
    	  logger.log(Status.INFO,"Entered customer name");
    	  taskpage.description("dummy message");
    	  logger.log(Status.INFO,"Enter description");
    	  taskpage.create();
    	  logger.log(Status.INFO,"Clicked on create customer button");
    	  String msg = taskpage.successmessage();
    	  System.out.println(msg);
    	  Assert.assertTrue(msg.contains("been created"));
    	  logger.log(Status.PASS,"Customer Created Successfully");
    	  Thread.sleep(2000);
    	  entertimepage.clicklogout();
    	  logger.log(Status.INFO,"Logged out from the Application");
    	  
    	  
    	  
    	  
}
}

