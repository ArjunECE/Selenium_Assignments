package week1.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListboxes {

	public static <WebElement> void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		Select dd1 = new Select(driver.findElement(By.id("dropdown1")));
		dd1.selectByVisibleText("Selenium");
		Select dd2 = new Select(driver.findElement(By.name("dropdown2")));
		dd2.selectByIndex(2);
		Select dd3 = new Select(driver.findElement(By.id("dropdown3")));
		dd3.selectByValue("3");
		Select dd = new Select(driver.findElement(By.className("dropdown")));
		dd.selectByValue("4");
		Select dd4 = new Select(driver.findElement(By.xpath("*[@id=\"contentblock\"]/section/div[6]/select")));
		dd4.selectByVisibleText("UFT/QTP");
		//
	}

}
