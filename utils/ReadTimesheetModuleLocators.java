package com.automationAspireportal.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import com.automationAspireportal.constants.FilePathConstants;
import com.automationAspireportal.testsuite.TestsuiteBase;

public class ReadTimesheetModuleLocators extends TestsuiteBase
{
	File timesheetfile = new File(FilePathConstants.Aspireportaltimesheet_locators);
	FileInputStream fis=null;
	Properties property=null;
	public ReadTimesheetModuleLocators() 
	{
		try {
			fis=new FileInputStream(timesheetfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String clickonTimesheet() {
		return property.getProperty("Loc.Timesheet.txt");
	}

	public String slectActivity() {
		return property.getProperty("Loc.activity.dropdown");
	}

	public String activity() {
		return property.getProperty("Loc.activity.txt");

	}

	public String clickonMonday() {
		return property.getProperty("Loc.monday.txt");

	}

	public String clickonTuesday() {
		return property.getProperty("Loc.tuesday.txt");

	}

	public String clickonwednesday() {
		return property.getProperty("Loc.wednesday.txt");

	}

	public String clickonThursday() {
		return property.getProperty("Loc.thursday.txt");
	}

	public String clickonFriday() {
		return property.getProperty("Loc.friday.txt");

	}

	public String clickonNotes() {
		return property.getProperty("Loc.employeenotes.btn");
	}

	public String giveNotes() {
		return property.getProperty("Loc.givenotes.txt");
	}

	public String clickcheck() {
		return property.getProperty("Loc.clickoncheck.btn");

	}

	public String clickonAddactivity() {
		return property.getProperty("Loc.addactivity.btn");

	}

//	public String selectactivity1() {
//		return property.getProperty("Loc.selectactivity1.dropdown");
//	}
//
//	public String activity2() {
//		return property.getProperty("Loc.activity1.txt");
//	}

	public String deleteactivity() {
		return property.getProperty("Loc.deleteactivity.btn");
	}
	public String saveTimesheet() {
		return property.getProperty("Loc.save.btn");
	}
	public String saveOk() 
	{
		return property.getProperty("Loc.ok.btn");
	}
	public String submit() {
		return property.getProperty("Loc.submit.btn");
	}
	public String timesheetalertmsg()
	{
		return property.getProperty("Loc.timesheetalertmsg.txt");
		
	}
	public String profile()
	{
		return property.getProperty("Loc.logout.btn");
	}
	public String  clickonlogout() {
		return property.getProperty("Loc.logouttext.btn");
		
	}
	//manger locators//
	public String clickoncheckbox() {
		return property.getProperty("Loc.selectemployee.checkbox");
	}
	public String clickonApprove()
	{
		return property.getProperty("Loc.approve.txt");
	}
	public String clickonApproveaction() 
	{
		return property.getProperty("Loc.approve.check");
	}

	public String clickonreject() {
		return property.getProperty("Loc.reject.btn");
	}

	public String clickontextarea() {
		return property.getProperty("Loc.comment.txt");
	}

	public String popupreject() {
		return property.getProperty("Loc.popupreject.btn");
	}

	public String rejectaction()
	 {
	 return property.getProperty("Loc.rejectaction.btn");
	 }
	public String clickonshifts() {
		return property.getProperty("Loc.shifts.txt");
	}

	public String clickonselectprojecttb() {
		return property.getProperty("Loc.selectprojecttextbox.txtbox");
	}

	public String selectproject() {
		return property.getProperty("Loc.selectproject.txt");
	}

	public String updateshifts() {
		return property.getProperty("Loc.updateshifts.txt");

	}

	public String cickonselectemployee() {
		return property.getProperty("Loc.selectemployee.textbox");

	}

	public String selectemployeelogin() {
		return property.getProperty("Loc.employeelogin.txt");
	}

	public String clickonstartdate() {
		return property.getProperty("Loc.startdate.textbox");
	}

	public String enterstartingdate() {
		return property.getProperty("Loc.sdate.txt");
	}

	public String clickonenddate() {
		return property.getProperty("Loc.enddate.textbox");

	}

	public String enterenddate() {
		return property.getProperty("Loc.edate.txt");

	}

	public String clickonshift() {
		return property.getProperty("Loc.shifts.textbox");

	}

	public String selectshift() {
		return property.getProperty("Loc.shifttype.txt");
	}

	public String clickonBack() {
		return property.getProperty("Loc.back.btn");
	}
	
	//Reports//

	public String clickonreports() {
		return property.getProperty("Loc.reports.txt");
	}
	public String clickonselectclient()
	{
		return property.getProperty("Loc.selectclient.dropdwn");
		
	}
	public String clickonselectproject()
	{
		return property.getProperty("Loc.selectproject.dropdwn");
		
	}
	public String project() 
	{
		return property.getProperty("Loc.selectproject.txt");
	}
	public String clickonSelectemployeedrpdwn()
	{
		return property.getProperty("Loc.selectemployee.drpdwn");
		
	}
	public String clickonselctactivity()
	
	{
		return property.getProperty("Loc.selectactivity.dropdwn");
	}
	public String clickonselectstatus() 
	{
		return property.getProperty("Loc.selectstatus.dropdwn");
	}
	public String clickonbiling()
	{
		return property.getProperty("Loc.billing.dropdwn");
	}
	public String clickonexportAs() 
	{
		return property.getProperty("Loc.export.dropdwn");
	}
	public String clickonreportAs() 
	{
		return property.getProperty("Loc.reportas.dropdwn");
	}
	public String timesheetalert()
	{
		return property.getProperty("Loc.timesheetalert.text");
	}
	
	public String clickonexport() {
		return property.getProperty("Loc.export.btn");
	}
	public String clickonpdf() 
	{
		return property.getProperty("Loc.downloadpdf.btn");
	}
	public String clickonexcel() 
	{
		return property.getProperty("Loc.downloadxcel.btn");
	}
	 public String activityreport()
	 {
		 return property.getProperty("Loc.activityreoprt.tab");
	 }
	//Admin reeject selectproject##
	
	public String admintimesheetSelectproject()
	{
		return property.getProperty("Loc.adminrejectselectproject.drpdwn");
	}
	//Admin reports //
	
	public String changeloginasadmin()
	{
		return property.getProperty("Loc.admintimesheet.drpdwn");
	}
	public String clickonsendtimesheet() 
	{
		return property.getProperty("Loc.sendtimesheet.btn");
	}
	public String clickonreportinggmail()
	{
		return property.getProperty("Loc.reportinggmail.txtbox");
		
	}
	public String clickonsendgmailbtn()
	{
		return property.getProperty("Loc.sendreportinggmail.btn");
	}
	public String catchpopuptext() 
	{
		return property.getProperty("LOc.popuptext.txt");
	}
	public String clickonclosepopup() 
	{
		return property.getProperty("Loc.closepopup.btn");
		
	}
	public String clickontimesheetsenttab()
	{
		return property.getProperty("Loc.timesheetsent.tab");
	}
	public String clickontimesheesenttclient() 
	{
		return property.getProperty("Loc.slectclienttimeshetsent.drpdwn");
	}
	public String clickontimeshetsentproject() 
	{
		return property.getProperty("Loc.selectprojecttimeshetsent.drpdwn");
		
	}
	public String tsstartingdate()
	{
		return property.getProperty("Loc.timesheetsentstartdate");
	}
	public String tsenddate() 
	{
		return property.getProperty("Loc.timehsheetsentenddate");
	}
	public String timesheetsentsearch()
	{
		return property.getProperty("Loc.timesheetsentsearch.btn");
	}
	public String timesheetsentactiondelete() 
	{
		return property.getProperty("Loc.timehsheetsentdelete.toggle");
	}
	public String timesheetsentconfirmationpopup() 
	{
		return property.getProperty("Loc.timesheetsentpopupdelete.txt");
	}
	public String clickontimesheetsentdelete() 
	{
		return property.getProperty("Loc.timesheetsentdelete.btn");
	}
	//Admin Allemployees tab//
	public String clickonallemployeestab() 
	{
		return property.getProperty("Loc.allemployees.tab");
	}
	public String allemployeesselectemployee()
	{
		return property.getProperty("Loc.allslectemployee.drpdwn");
	}
	public String allstartdate()
	{
		return property.getProperty("Loc.allemployeesstartday.label");
	}
	public String allenddate()
	{
		return property.getProperty("Loc.allemployeesenddate.label");
	}
	public String allemployeesexport() 
	{
		return property.getProperty("Loc.allemployeesexport.btn");
	}
	//freeze shifts//
	public String clickonfreezeshifts()
	{
		return property.getProperty("Loc.freezeshifts.tab");
	}
	public String clickonfreezedate() 
	{
		return property.getProperty("Loc.freezedate.txtbox");
	}
	public String freezemonth()
	{
		return property.getProperty("Loc.freezemonth.txt");
	}
	public String clickonfreeze()
	{
		return property.getProperty("Loc.freeze.btn");
	}
	public String confirmationmsg() 
	{
		return property.getProperty("Loc.confirmationmsg.txt");
	}
	//Admin Addactivity tab//
	public String adminaddactivity()
	{
		return property.getProperty("Loc.clickonadminaddactivity.label");
		
	}
	public String adminactvity()
	{
		return property.getProperty("Loc.adminactivity.drpdwn");
	}
	
	
	


}
