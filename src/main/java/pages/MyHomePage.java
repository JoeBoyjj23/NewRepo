package pages;

import annot.Annotations;

public class MyHomePage extends Annotations{

	public MyHomePage clickLeads() {
		driver.findElementByLinkText("Lead").click();
		return this;
	}
	
	public MyHomePage clickCreateLeads() {		
		driver.findElementByLinkText("Create Lead").click();
		return this;
	}
}
