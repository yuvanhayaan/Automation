package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;



public class General extends Global {
	

		public void openApplication() {
			System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to(url);
			System.out.println("application opened");
			Log.info("application opened");
		}
		
		public void closeApplication() {
			driver.close();
			System.out.println("application closed");
			Log.info("application closed");
		}
		public void login() {
			driver.findElement(By.name("txtUserName")).sendKeys(un);
			driver.findElement(By.name("txtPassword")).sendKeys(pw);
			driver.findElement(By.name("Submit")).click();
			System.out.println("login completed");
			Log.info("logincompleted");
		}
		//enter frames
		public void addnewemp() {
		
			//driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath(addnewemp)).click();
			driver.findElement(By.name(first_name)).sendKeys(fn);
			driver.findElement(By.name(last_name)).sendKeys(ln);
			driver.findElement(By.id(save_btn)).click();
			System.out.println("addemployee");
			Log.info("addemployee");
		}
            public void enterframe() 
            {
            
            	driver.switchTo().frame(frame_entry);
            	System.out.println("enter frame");
            	Log.info("enter frame");
            	
            	
            }
            
            public void editemployee() 
            {
            	
            	driver.findElement(By.name(edit_btn)).click();
            	driver.findElement(By.name(first_name)).sendKeys(fn);
            	driver.findElement(By.name(last_name)).sendKeys(ln);
            	driver.findElement(By.xpath(save_btn2)).click();
            
            	
            	
            	//driver.findElement(By.xpath(save_btn2)).click();
            
            	driver.findElement(By.xpath(save_btn3)).click();
            	System.out.println("edit exiting employee");
            	Log.info("edit exiting employee");
            	
            	
            }
            
            
            public void selectmethod()
            {
            	Select sl = new Select(driver.findElement(By.xpath("//*[@id='loc_code']")));
            	sl.selectByVisibleText("Emp. ID");
            }
            public void delemp() 
            {
            	
            
            	
            	driver.findElement(By.xpath(searchfor)).sendKeys("10000");
            	
            	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input[2]")).click();
            			
            	driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr/td[1]/input")).click();
            	driver.findElement(By.xpath(delet_btn)).click();
            	System.out.println("delete exiting employee");
            	Log.info("delete exiting employee");
            	
            }
            public void exitframe() 
            {
            	driver.switchTo().defaultContent();
            	System.out.println("frame exited in the this page");
            	Log.info("frame exited in this page");
    
			
		}
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		Log.info("logout completed");
	
		
	}
		
}

	


