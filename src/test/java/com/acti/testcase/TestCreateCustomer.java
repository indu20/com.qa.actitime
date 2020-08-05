package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestCreateCustomer extends BaseTest
{      
	
	  @Test
      public void TestCreateCustomer() throws Exception 
      {
    	  loginpage.validateLoginFunction("admin","manager");
    	  entertimepage.clickTaskmenu();
    	  taskpage.clickaddnewbutton();
    	  taskpage.clicknewcustomer();
    	  taskpage.entername("Testing customer");
    	  taskpage.description("dummy message");
    	  taskpage.create();
    	  String msg = taskpage.successmessage();
    	  System.out.println(msg);
    	  Assert.assertTrue(msg.contains("been created"));
    	  Thread.sleep(2000);
    	  entertimepage.clicklogout();
    	  
    	  
    	  
}
}

