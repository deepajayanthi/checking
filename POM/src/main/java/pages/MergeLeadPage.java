package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;


public class MergeLeadPage extends ProjectMethods {
	
	
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;	
		this.test = test;
			PageFactory.initElements(driver, this);
		}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	public WebElement eleFromLeadLookup;
	public FindLeadPopPage clickFromLeadLookup(){
		clickWithNoSnap(eleFromLeadLookup);
		switchToWindow(1);
		return new FindLeadPopPage(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	public WebElement eleToLeadLookup;
	public FindLeadPopPage clickToLeadLookup(){
		clickWithNoSnap(eleToLeadLookup);
		switchToWindow(1);
		return new FindLeadPopPage(driver, test);		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	public WebElement eleclickMergeButton;
	public ViewLeadPage clickMergeButton(){
		clickWithNoSnap(eleclickMergeButton);
		acceptAlert();
		return new ViewLeadPage(driver,test);
	}
}