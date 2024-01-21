package seleniumQAidea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Properties;

	public class Login_cases {
	    public static void main(String[] args) {
	        ConfigReader config = new ConfigReader();
	        
	        // Get ChromeDriver path from properties file
	        String chromedriverPath = config.getChromeDriverPath();
	        
	        // Set ChromeDriver property
	        System.setProperty("webdriver.chrome.driver", chromedriverPath);

	       
	        
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");

			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
			
			//Login into the portal
			driver.get("https://portal.ubiattendance.com/");
			driver.findElement(By.id("uname")).sendKeys("fnp@mailinator.com");
			driver.findElement(By.id("psw")).sendKeys("abcd12345");
	    }
	}



