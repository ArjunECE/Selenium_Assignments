package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lenskart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		WebElement getEyeGlasses = driver.findElementByXPath("//div[@class = 'nav-level-1 three-col-layout']/a");
		builder.moveToElement(getEyeGlasses).perform();
		WebElement getMen = driver.findElementByXPath("//span[@class = 'uppercase']");
		builder.moveToElement(getMen).perform();
		WebElement movePremium = driver.findElementByXPath("(//div[@class = 'category-menu_items']/span)[3]");
		builder.moveToElement(movePremium).click().perform();
		WebElement SelectRoundShape = driver.findElementByXPath("//span[@title = 'Round']/img");
		builder.moveToElement(SelectRoundShape).click().perform();
		WebElement SelectColor = driver.findElementByXPath("(//label//span)[25]");
		builder.moveToElement(SelectColor).click().perform();
		WebElement SelectFirstFrame = driver.findElementByXPath("(//a[@class = 'no-decoration display-block padding-t20 padding-r20 padding-l20'])[1]");
		builder.moveToElement(SelectFirstFrame).perform();
		String FrameSize = driver.findElementByXPath("//p[@class = 'fs12 no-decoration text-black margin-b0 inline-block']/span").getText();
		System.out.println(FrameSize);
		driver.close();
	}

}
