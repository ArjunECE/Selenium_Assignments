package SeleniumProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");    //1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.manage().window().maximize();    
		driver.findElementById("username").sendKeys("Demosalesmanager");  //2. Enter UserName and Password Using Id Locator
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();   //3. Click on Login Button using Class Locator
		driver.findElementByLinkText("CRM/SFA").click();			//4. Click on CRM/SFA Link
		driver.findElementByLinkText("Contacts").click();           //5. Click on contacts Button
		driver.findElementByLinkText("Create Contact").click();           //6. Click on Create Contact
		driver.findElementById("firstNameField").sendKeys("Arjun");		//7. Enter FirstName Field Using id Locator
		driver.findElementById("lastNameField").sendKeys("Durai");		//8. Enter LastName Field Using id Locator
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Arj");		//9. Enter FirstName(Local) Field Using id Locator
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("D");		//10. Enter LastName(Local) Field Using id Locator
		driver.findElementByName("departmentName").sendKeys("Testing");					//11. Enter Department Field Using any Locator of Your Choice
		driver.findElementById("createContactForm_description").sendKeys("To test Application Functionality in R & D Lab Environment");	//12. Enter Description Field Using any Locator of your choice
		driver.findElementById("createContactForm_primaryEmail").sendKeys("arj_456@gmail.com"); //13. Enter your email in the E-mail address Field using the locator of your choice
		Select dd = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));	//14. Select State/Province as NewYork Using Visible Text
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();			//15. Click on Create Contact
		driver.findElementByLinkText("Edit").click();						//16. Click on edit button
		driver.findElementById("updateContactForm_description").clear();	//17. Clear the Description Field using .clear
		driver.findElementById("updateContactForm_importantNote").sendKeys("Its mandatory to display results in R & D Lab Board at  EOD"); // 18. Fill ImportantNote Field with Any text
		driver.findElementByXPath("(//input[@class = 'smallSubmit'])[1]").click();  //19. Click on update button using Xpath locator
		System.out.println(driver.getTitle()); //Get the Title of Resulting Page.
		driver.close();
		
	}

}
