package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;


public class DuplicateLeadPage extends ProjectMethods {
	
	
	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;	
		this.test = test;
			PageFactory.initElements(driver, this);		
		}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadDublicate;
	public ViewLeadPage clickCreateLeadDublicate(){
		click(eleCreateLeadDublicate);
		return new ViewLeadPage(driver, test);
	}
}
