package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarUsingAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		WebElement datePick = driver.findElementByXPath("//input[@id ='datepicker']");
		Thread.sleep(3000);
		builder.moveToElement(datePick).click();
	}

}
