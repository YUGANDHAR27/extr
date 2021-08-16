package com.automationAspireportal.helper;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class EmployeePageHelper 
{
	WebDriver driver;
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	ReadExcel excel= new ReadExcel(0);
	public EmployeePageHelper(WebDriver driver)
	{
		this.driver = driver;
	}

	public void employeeHelper() throws InterruptedException 
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Select employeeactivity=new Select(driver.findElement(By.xpath(read.slectActivity())));
		employeeactivity.selectByVisibleText("Training");;
		//	driver.findElement(By.xpath(read.activity())).click();
		driver.findElement(By.xpath(read.clickonMonday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonTuesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonwednesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonThursday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonFriday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonNotes())).click();
		Thread.sleep(2000);
		//		WebElement enternote=driver.findElement(By.xpath(read.giveNotes()));
		//		enternote.click();
		//		enternote.sendKeys("Thank you Sir");
		//		Thread.sleep(2000);
		//	driver.findElement(By.xpath(read.clickcheck())).click();
		driver.findElement(By.xpath(read.clickonAddactivity())).click();
		driver.findElement(By.xpath(read.deleteactivity())).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(read.saveTimesheet())).click();	
		Thread.sleep(2000);
		String Actualres=driver.findElement(By.xpath(read.timesheetalertmsg())).getText();
		String Expectedres="Timesheet saved successfully";
		assertEquals(Actualres, Expectedres);
		Thread.sleep(4000);
		driver.findElement(By.xpath(read.submit())).click();
		Thread.sleep(2000);
		String Actualres1=driver.findElement(By.xpath(read.timesheetalertmsg())).getText();
		String Expectedres1="Timesheet submitted successfully";
		assertEquals(Actualres1, Expectedres1);
		Thread.sleep(5000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

	}

}
