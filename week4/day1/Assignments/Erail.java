package week3;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MDU",Keys.TAB);
		Thread.sleep(2000);
		driver.findElementById("buttonFromTo").click();
		driver.findElementById("chkSelectDateOnly").click();
		List<WebElement> rows = driver.findElementsByXPath("//table[@class = 'DataTable TrainList TrainListHeader']//tr"); 		
		int rowCount = rows.size();
		
		List<String> trainNames = new ArrayList<String>();
		
		for (int i = 1; i <= rowCount; i++) {
			String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			trainNames.add(trainName);
		}
		 System.out.println(trainNames);
		 
		 Set <String> s = new HashSet<String>(trainNames);
		 if (s.size() == trainNames.size()) {
			System.out.println("There are no duplicates in train names");
		}
		 else {
				System.out.println("There are  duplicates in train names");

		}
		 driver.close();
	}

}
