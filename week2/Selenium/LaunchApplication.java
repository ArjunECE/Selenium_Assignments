package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Plin GTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Arjun");
		driver.findElementById("createLeadForm_lastName").sendKeys("Durai");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("AD_LEAD_PROFILE");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("983");
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		//driver.close();
	}

}
