package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMultiSelectUsingAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		WebElement option1 = driver.findElementByXPath("//option[@disabled='true']/following-sibling::option[1]");
		WebElement option2 = driver.findElementByXPath("//option[@disabled='true']/following-sibling::option[2]");
		WebElement option3 = driver.findElementByXPath("//option[@disabled='true']/following-sibling::option[3]");
		WebElement option4 = driver.findElementByXPath("//option[@disabled='true']/following-sibling::option[4]");
		
		builder.keyDown(Keys.CONTROL).click(option1).click(option2).click(option3).click(option4).keyUp(Keys.CONTROL).perform();
	}

}
