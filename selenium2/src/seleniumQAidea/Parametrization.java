package seleniumQAidea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametrization {
	
	@DataProvider (name = "Testdata")
		
		public Object[][] testdata (){
			return new Object[][] {
				{"student","Password123"},
				{"student1","Password1234"},
			};
		}
	@Test(dataProvider = "Testdata")
		
		public void logintest(String Username, String Password) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://practicetestautomation.com/practice-test-login/");
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		    
		    
		}
		
	
	}

