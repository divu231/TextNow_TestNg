package code;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import java.io.*;

public class Core extends Constants {
	public WebDriver driver;
	public void setupff()
	{
		System.setProperty("webdriver.firefox.marionette", "//lib");
		driver=new FirefoxDriver();
		driver.get(url);
		
	}
	
	public void closeff()
	{
		driver.close();
		
	}
}
