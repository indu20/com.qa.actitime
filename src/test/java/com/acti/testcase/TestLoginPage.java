package com.acti.testcase;

import org.testng.annotations.Test;
import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class TestLoginPage extends DriverScript
{
   public TestLoginPage() 
   {
	  super(); //Super keyword is used to call the parent class constructor
	   
}       
       @Test
	    public void verifyLoginpage()
	    {
	     initBrowser();
	     LoginPage loginpage = new LoginPage();
	     String title = loginpage.verifyLoginPagetitle();
	     System.out.println(title);
	     
	   }
       
       public void validateLoginFun()
       {
    	   initBrowser();
    	   LoginPage lp = new LoginPage();
    	   lp.validateLoginFunction("admin","password");
    	   EnterTimePage tp = new EnterTimePage();
    	   tp.clicklogout();
    	   //driver.close();
       }
}
