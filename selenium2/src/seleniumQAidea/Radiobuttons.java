package seleniumQAidea;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobuttons {
	
	public Radiobuttons() {
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		//Disable browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Implicit wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Login into the portal
		driver.get("https://portal.ubiattendance.com/");
		driver.findElement(By.id("uname")).sendKeys("fnp@mailinator.com");
		driver.findElement(By.id("psw")).sendKeys("abcd12345");
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//HumanBeing hm = new HumanBeing();
		
		
		//driver.findElement(By.xpath("//button[@id='login']"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='login']"))).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@id='login']")).click();
		 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Geo-fence']")).click();
		driver.findElement(By.xpath("//img[@src='https://portal.ubiattendance.com/index.php/../assets/icons/restriction-icon.svg']")).click();
 List<WebElement> radio = driver.findElements(By.xpath("//input[@name='fenceopt']"));
 System.out.println("Total buttons :" + radio.size());
        System.out.println(radio.get(0).isEnabled());
 System.out.println(radio.get(1).isEnabled());
 
 WebElement restriction = driver.findElement(By.xpath("//input[@id='ena']"));
 restriction.click();
 System.out.println("Resrytiction is enabled:" + restriction.isEnabled());
 
 driver.findElement(By.xpath("//button[@id='btnfenceset']")).click();
 
 driver.close();
 
	}

}
