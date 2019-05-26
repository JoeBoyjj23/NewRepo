package pages;

import annot.Annotations;

public class Login extends Annotations {

	public Login enterUserName(String data) {
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}

	public Login enterPassword(String data) {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}

	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
}