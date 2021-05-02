package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		List<WebElement> rows = driver.findElementsByXPath("//table[@id = 'table_id']//tr");
		int rowSize = rows.size();
		System.out.println("The Number of Columns is "+rowSize);
		for (int i = 2; i < rowSize; i++) {
			
			List<WebElement> cols = driver.findElementsByXPath("//table[@id = 'table_id']//tr["+i+"]/td");
			int columnSize = cols.size();
			System.out.println("The Number of Rows is "+columnSize);
			for (int j = 1; j < columnSize ; j++) {
				String data = driver.findElementByXPath("//table[@id = 'table_id']//tr["+i+"]/td["+j+"]").getText();
				System.out.println(data);
				
			}

		}
		
		
		
	}

}
