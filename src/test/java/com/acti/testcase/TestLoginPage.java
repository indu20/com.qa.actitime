package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest
{
	
         
        @Test(priority=0)
	    public void verifyLoginpage()
	    {
	     String actual = "actiTIME - Login";
	     String title = loginpage.verifyLoginPagetitle();
	     Assert.assertEquals(title,actual);
	     System.out.println(title);
	     
	   }
       @Test(priority=2)
       public void validateLoginFun()
       {
    	   
    	   loginpage.validateLoginFunction("admin",  "manager");
    	   entertimepage.clicklogout();
       }
       
       @Test(priority=1)
       public void actilogo()
       {
    	  boolean logo = loginpage.verifyactilogo();
    	  Assert.assertTrue(logo);
    	  
    	  
    	}
       @Test(priority=3)
       public void checkbox()
       {
    	  boolean chk = loginpage.verifycheckbox();
    	  Assert.assertTrue(chk);
    	 }
       
}
