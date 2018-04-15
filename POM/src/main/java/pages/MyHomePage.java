package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;



public class MyHomePage extends ProjectMethods {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;	
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT,using="Leads")
	public WebElement eleLeadLink;
	// Click Leads 
	public MyLeadsPage clickLeadLink(){
		click(eleLeadLink);
		return new MyLeadsPage(driver, test);
	}


}
