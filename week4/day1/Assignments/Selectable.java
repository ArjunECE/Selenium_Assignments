package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
	
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(Keys.CONTROL).perform();

	}

}
