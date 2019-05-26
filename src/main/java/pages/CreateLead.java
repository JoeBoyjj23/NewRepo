package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import annot.Annotations;

public class CreateLead extends Annotations {

	public static void main(String[] args) {

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Lead").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Joseph");
		driver.findElementById("createLeadForm_lastName").sendKeys("Thangapandian");

		//Verify First name
		String verifyName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(verifyName);
	}


}


