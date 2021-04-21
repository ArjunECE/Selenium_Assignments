package SeleniumProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");    //1	Launch the browser
		driver.manage().window().maximize();    
		driver.findElementById("username").sendKeys("Demosalesmanager");  // 2	Enter the username
		driver.findElementById("password").sendKeys("crmsfa");	//3	Enter the password
		driver.findElementByClassName("decorativeSubmit").click();   //  4	Click Login
		driver.findElementByLinkText("CRM/SFA").click();			//4. Click on CRM/SFA Link
		driver.findElementByLinkText("Leads").click();           //6	Click Leads link 
		driver.findElementByLinkText("Create Lead").click();
		driver.fin
	}

}
