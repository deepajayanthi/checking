package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPagePage;
import wdMethods.ProjectMethods;


public class TC005_DuplicateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DuplicateLead";
		testDescription="Duplicate a Lead - LeafTaps";
		testNodes = "Leads";
		browserName="chrome";
		dataSheetName="TC005";
		category="Regression";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String password ,String emailAddress) throws InterruptedException{

		String fName=new LoginPagePage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFALink()		
		.clickLeadLink()		
		.clickFindLead()
		.clickEmailTab()
		.enterEmailAddress(emailAddress)
		.clickFindleadsButton()
		.getFirstResultingFirstName();
		new FindLeadPage(driver, test)
		.clickFirstResultingLead()
		.clickDuplicateLeadLink()
		.clickCreateLeadDublicate()
		.verifyFirstName(fName);
		
	}

}
