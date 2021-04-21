package SeleniumProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	private static final String List = null;

	public static void main(String[] args) throws InterruptedException{

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
		driver.findElementByLinkText("Find Leads").click();		//7	Click Find leads
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner']//span)[2]").click(); //8	Click on Phone
		driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("9");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		WebElement d1 = driver.findElementByXPath("");
		//driver.findElementByXPath("//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']").click();
		//System.out.println(driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").getText());
		//driver.findElementByXPath("//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class = 'linktext']").click();
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").click();
		//driver.findElementByLinkText("11048");
		//driver.findElementByClassName("subMenuButtonDangerous").click();
		//driver.findElementByXPath("(//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class = 'linktext'])[1]").click();
		//driver.findElementByClassName("subMenuButtonDangerous").click();
	}

}
