package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Attendance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//Disable browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://portal.ubiattendance.com/");
		//Login into the portal
		driver.get("https://portal.ubiattendance.com/");
		driver.findElement(By.id("uname")).sendKeys("fnp@mailinator.com");
		driver.findElement(By.id("psw")).sendKeys("abcd1234");
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("login")).click();
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	    //driver.findElement(By.xpath("//button[normalize-space()='Upgrade']")).click();
	    
	    
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Employees'])[1]/following::span[2]")).click();
	    driver.findElement(By.xpath("//div[@id='example_wrapper']/div[2]/button[3]/span/span/img")).click();
	    
Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='reportrange']")).click();
	    driver.findElement(By.xpath("//li[@data-range-key='This Month']")).click();

	   //driver.findElement(By.xpath("//th/span")).click();
	    driver.findElement(By.xpath("//button[@id='getAtt']")).click();
	    //driver.findElement(By.id("getAtt")).click();
	    driver.findElement(By.xpath("//div[@id='example_wrapper']/div[2]/div/button/span/span/img")).click();
	    driver.findElement(By.xpath("//div[@id='example_wrapper']/div[2]/div/div[2]/div/a/span")).click();
	 driver.close();

	}
}

