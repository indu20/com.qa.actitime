package com.acti.testcase;

import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class TestCreateCustomer extends BaseTest
{
      public TestCreateCustomer() throws InterruptedException 
      {
    	  loginpage.validateLoginFunction("admin","manager");
    	  entertimepage.clickTaskmenu();
    	  taskpage.clickaddnewbutton();
    	  taskpage.clicknewcustomer();
    	  taskpage.entername("shalu");
    	  Thread.sleep(2000);
    	  entertimepage.clicklogout();
    	  
    	  
    	  
}
}

