package annot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import dataused.DataInput;

public class Annotations {
	public static ChromeDriver driver;
	public String excelFileName;

	@BeforeMethod
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver74.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	@DataProvider
	public String[][] getData() throws InvalidFormatException, IOException{
		return DataInput.readExcel(excelFileName);
	}
}
