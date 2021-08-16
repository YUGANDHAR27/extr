package com.automationAspireportal.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;

public class EmployeeloginHelper {
 WebDriver driver;
	ReadLocators read = new ReadLocators();
	ReadExcel excel= new ReadExcel(0);
	
	  public EmployeeloginHelper(WebDriver driver)
	  {
	this.driver = driver;
}

	public void employeelogin() {
		String username = read.emailPath();
		String password = read.passwordPath();
		String email = excel.getmail();
		String employeepassword = excel.password();
		String clicklogin = read.clickOnLogin();
		String tsheet = read.clickontimesheet();
		WebElement user = driver.findElement(By.xpath(username));
		user.sendKeys(email);
		WebElement epassword = driver.findElement(By.xpath(password));
		epassword.sendKeys(employeepassword);
		WebElement click = driver.findElement(By.xpath(clicklogin));
		click.click();
		WebElement clickonts = driver.findElement(By.xpath(tsheet));
		clickonts.click();
		


	}
}
