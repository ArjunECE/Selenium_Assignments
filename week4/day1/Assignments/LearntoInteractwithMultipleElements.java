package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearntoInteractwithMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		WebElement shirtselection = driver.findElementByXPath("//li[@class = 'navlink lnHeight']//span[@class = 'catText']");
		builder.moveToElement(shirtselection).perform();
		driver.findElementByLinkText("Shirts").click();
		Thread.sleep(4000);
		WebElement ShirtDrag = driver.findElementByXPath("//p[@class = 'product-title']");
		builder.moveToElement(ShirtDrag).perform();
		driver.findElementByXPath("//div[@class = 'clearfix row-disc']/div").click();
		Thread.sleep(5000);
		driver.close();
		 
	}

}

