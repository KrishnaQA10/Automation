package seleniumQAidea;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//Disable browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Login into the portal
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement Search = driver.findElement(By.className("gLFyf"));
		Search.sendKeys("selenium");
		Search.sendKeys(Keys.ENTER);
		
		
		//Handle Auto suggestions
		 driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
		 driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			Search.click();
		 
		List<WebElement> Autosuggestions = driver.findElements(By.xpath("//div[@role='presentation']"));
		System.out.println("Total no. of Autosuggestions:" + Autosuggestions.size());
		

	}

}
