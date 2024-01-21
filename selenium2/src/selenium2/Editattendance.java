package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Editattendance {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//Disable browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Login into the portal
		driver.get("https://portal.ubiattendance.com/");
		driver.findElement(By.id("uname")).sendKeys("fnp@mailinator.com");
		driver.findElement(By.id("psw")).sendKeys("abcd12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='login']")).click();
		 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Employees'])[1]/following::span[2]")).click();
		    driver.findElement(By.xpath("//div[@id='example_wrapper']/div[2]/button[3]/span/span/img")).click();
		    
	Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='reportrange']")).click();
		    driver.findElement(By.xpath("//li[@data-range-key='This Month']")).click();
		    driver.findElement(By.xpath("//button[@id='getAtt']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//tbody/tr[3]/td[8]/div[1]/ul[1]/li[3]")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//ul[@class='dropdown-menu show']//a[contains(text(),'Edit')]")).click();
			    //driver.findElement(By.xpath("//input[@id='timeInE1']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
			    WebElement Editattendance = driver.findElement(By.xpath("//a[@id='decrementHour']"));
			    
			//Define the no. of times we want to click 
			    int clickonedit = 3;
			    
			for (int i =0; i < clickonedit; i++) {
				Editattendance.click();
				}
			
	 driver.findElement(By.xpath("//button[@id='saveE']")).click();    

	}

}


