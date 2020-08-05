package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskListPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends DriverScript
{

	LoginPage loginpage;
	EnterTimePage entertimepage;
	TaskListPage taskpage;
	ExtentHtmlReporter htmlReport;
	ExtentReports extent;
	ExtentTest logger;
	
	

	public BaseTest() 
	   {
		  super(); //Super keyword is used to call the parent class constructor
		   
	  }
	@BeforeClass
	public void reportconfig()
	{
		//create an object of EXTENDHTMLREPORTER and give the path of where reports to be generated
		htmlReport = new ExtentHtmlReporter("./reports/Actiautomation.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReport);
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
    	 extent.flush();//which flush out the htmlreport(must to add on end when use ectenthtmlreporter)
    	driver.close();
    }
}
