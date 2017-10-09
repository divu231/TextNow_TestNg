package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	public WebDriver driver;
	FirefoxBinary firefoxBinary;
	FirefoxOptions firefoxOptions;
	//public FirefoxDriver driver;
	public void setupff()
	{
		System.setProperty("webdriver.gecko.driver", Constants.geckopath);
		driver=new FirefoxDriver();
		driver.get(Constants.url);	
	}
	public void setupffheadless()
	{
		   firefoxBinary = new FirefoxBinary();
		   firefoxBinary.addCommandLineOptions("--headless");
		   System.setProperty("webdriver.gecko.driver", Constants.geckopath);
		   firefoxOptions = new FirefoxOptions();
		   firefoxOptions.setBinary(firefoxBinary);
		    driver = new FirefoxDriver(firefoxOptions);
		    driver.get(Constants.url);
	}
	public void login()

	{
		WebElement uname =driver.findElement(By.id(Constants.uname_id));
		uname.sendKeys(Constants.uname_val);
		WebElement pass =driver.findElement(By.id(Constants.pass_id));
		pass.sendKeys(Constants.pass_val);
		WebElement login =driver.findElement(By.id(Constants.login_id));
		login.click();
		
	}
	
	public void verifytitle()
	{
		//String title="TextNow";
	       String actual;
	       WebDriverWait wait = new WebDriverWait(driver, 10);
	       WebElement elm=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.verify_name)));
	       actual=elm.getText();
	       
	       if(actual.contentEquals(Constants.string_to_verify))
	    	    System.out.println("Test passed");
	       else
	    	   System.out.println("Test Fail");
	    	
	}
	public void closeff()
	{
		driver.close();
		
	}
}
