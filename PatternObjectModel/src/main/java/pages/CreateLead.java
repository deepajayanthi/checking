package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstname;
	@And("Enter first name as (.*)")
	public CreateLead enterfirstName(String data) {
		type(elefirstname, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastname;
	@And("Enter last name as (.*)")
	public CreateLead enterlastName(String data) {
		type(elelastname, data);
		return this;}
		
		@FindBy(how=How.ID,using="createLeadForm_companyName")
		private WebElement elecompanyname;
		@And("Enter company name as (.*)")
		public CreateLead entercompanyName(String data) {
			type(elecompanyname, data);
			return this;}
		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement elecreateleads;
		@When("click on create lead button")
	public ViewLead clickcreatelead() {
		click(elecreateleads);
		return new ViewLead();
	}
	
	
	

}
