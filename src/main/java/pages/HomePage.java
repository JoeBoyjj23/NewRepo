package pages;

import annot.Annotations;

public class HomePage extends Annotations {
	
	public MyHomePage clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
