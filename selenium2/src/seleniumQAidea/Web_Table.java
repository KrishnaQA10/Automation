package seleniumQAidea;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//Disable browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Login into the portal
		driver.get("https://money.rediff.com/gainers");
		//Get size of company in a table 
		List <WebElement> Company = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        System.out.println("Total no. of company :" + Company.size());
       
        //Get size of price in a table 
        List <WebElement> Price = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        System.out.println("Total no. of company :" + Price.size());
	}

}
