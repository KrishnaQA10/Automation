import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ObjectRepo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File src1= new File("C:\\Users\\LENOVO\\eclipse-workspace\\selenium2\\repository\\Locators.properties");
//create File.InputStream class object to load the file 
		
		FileInputStream fis1 = new FileInputStream (src1);
		//create properties class object to read property 
		
		Properties pro1 = new Properties();
		
		try {
			pro1.load(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//Disable browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get(pro1.getProperty("URL"));
	}

}
