package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementByCssSelector("body > div > div.main-container > div > div > div > form > button").click();
		String str10 = driver.getTitle();
		String source = "ACME System 1 - Dashboard";
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		if (str10 == source) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.close();
	}

}
