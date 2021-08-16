package com.automationAspireportal.testscript;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC21_Admin_Addactivity extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	@Test
	public void adminaddactivity() 
	{
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(read.adminaddactivity())).click();
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[1]/div/div/div/div/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String ActivityExpect="Alerts Monitoring";
		driver.findElement(By.xpath(read.adminactvity())).sendKeys(ActivityExpect);
		Select Activiftyfor = new Select(driver.findElement(By.xpath("//*[@id=\"projectType\"]")));
		Activiftyfor.selectByVisibleText("Single project");
		Select Selectclinet = new Select(driver.findElement(By.xpath("//*[@id=\"selectClient\"]")));
		Selectclinet.selectByVisibleText("Hyper Loop");
		Select Selectproject = new Select(driver.findElement(By.xpath("//*[@id=\"selectProject\"]")));
		Selectproject.selectByVisibleText("Hyper Loop");
		driver.findElement(By.xpath("//*[@id=\"saveActivity\"]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/section/div/div[2]/a/i")).click();
//		Select Selectproject1 = new Select(driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[2]/div/div/div/div[1]/div/form/div[2]/select")));
//		Selectproject1.selectByValue("56");
//		driver.findElement(By.xpath("//*[@id=\"heading_0\"]/td[1]/span/i")).click();
//		Select 	Shiftdrp=new Select(driver.findElement(By.xpath("//*[@id=\"project_0\"]/td[2]/select")));
//		Shiftdrp.selectByVisibleText(ActivityExpect);
//		
	}
}