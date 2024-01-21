package seleniumQAidea;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

	public class ConfigReader {
	    private Properties properties;

	    public ConfigReader() {
	        properties = new Properties();
	        try {
	            FileInputStream file = new FileInputStream("config.properties");
	            properties.load(file);
	            file.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public String getChromeDriverPath() {
	        return properties.getProperty("chromedriver.path");
	    }
	}



