package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class TestLoginPage extends DriverScript
{
	LoginPage loginpage;
	EnterTimePage entertimepage;
	
  public TestLoginPage() 
   {
	  super(); //Super keyword is used to call the parent class constructor
	   
}       @BeforeMethod
        public void beforeTest()
        {
           initBrowser();
	       loginpage = new LoginPage();
    	   entertimepage = new EnterTimePage();
    	   
        }

         @AfterMethod
        public void tearDown()
        {
        	driver.close();
        }
         
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
