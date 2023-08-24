package basicseleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win32.zip\\geckodriver.exe");
		
       WebDriver driver = new FirefoxDriver();
       driver.get("https://rahulshettyacademy.com/");
	}

}
