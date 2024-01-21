package seleniumQAidea;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript {
	

		public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk4NzU1NzI3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");

		//JavascriptExecutor

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//locate web element using java script

		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");

		jse.executeScript("document.getElementById('pass').value='abcd1234'");

		//scroll down using javascript
        Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400)");

		//scroll up using javascript
        Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-400)");


}
}