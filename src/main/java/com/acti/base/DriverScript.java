package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript
{
     public static WebDriver driver;
     public static Properties prop;
     
      public DriverScript() 
      {
    	   try {
    		   
    		   File src = new File("./config/config.properties");
    		   FileInputStream file = new FileInputStream(src);
    		    prop = new Properties();
    		    prop.load(file);
		} catch (Exception e) 
    	   
    	   {
		      System.out.println("unable to load properties file" + e.getMessage());
    	   
    	   }
      } 
           
    	   public static void initBrowser()
    	   {
    		    String browser = prop.getProperty("browser");
    		    if (browser.equalsIgnoreCase("chrome")) 
    		    {
					System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
					   driver = new ChromeDriver();
					   
				}
    		    else if (browser.equalsIgnoreCase("gecko")) 
    		    {
    		    	System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
					   driver = new FirefoxDriver();
					   
				}
    		    else
    		    {
    		    	System.out.println("NO browser specified properly	");
    	        }
    		    
    		    driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				
				String url = prop.getProperty("qaurl");
				driver.get(url);
				
				 
    	   
    	   
    	   
	}
     
      
      
}
