

package seleniumQAidea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_ListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//Disable browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Login into the portal
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		 
		
		   //select drop down value using select method 
		  WebElement country =  driver.findElement(By.id("dropdown-class-example"));
		  Select city = new Select(country);
		  city.selectByVisibleText("Option2");
		  System.out.println("Total value of country: " + country.getSize());
		  
		    

	}

}
