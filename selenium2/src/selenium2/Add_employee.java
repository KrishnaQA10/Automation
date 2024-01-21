package selenium2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Add_employee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//Disable browser notification
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");

	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	//Login into the portal
	driver.get("https://portal.ubiattendance.com/");
	driver.findElement(By.id("uname")).sendKeys("fnp@mailinator.com");
	driver.findElement(By.id("psw")).sendKeys("abcd1234");
	driver.findElement(By.id("login")).click();
	 
	//Add an Employee
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//a[@href='https://portal.ubiattendance.com/index.php/Userprofiles/employeelist']//div[@class='side-item-container']")).click();
	    driver.findElement(By.xpath("//img[@class='red-tooltip']")).click();
	    driver.findElement(By.id("firstName")).click();
	    driver.findElement(By.id("firstName")).clear();
	    driver.findElement(By.id("firstName")).sendKeys("Test");
	    driver.findElement(By.id("cont")).click();
	    driver.findElement(By.id("cont")).clear();
	    driver.findElement(By.id("cont")).sendKeys("7643372");
	    driver.findElement(By.id("country")).click();
	    new Select(driver.findElement(By.id("country"))).selectByVisibleText("India");
	    driver.findElement(By.linkText("Next")).click();
	    driver.findElement(By.linkText("Next")).click();
	    driver.findElement(By.id("doj")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[6]")).click();
	    driver.findElement(By.linkText("Next")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[@href='#finish']")).click();   
	    
	   
	  }
	}


