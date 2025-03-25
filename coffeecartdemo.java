package demo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
public class coffeecartdemo {
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://coffee-cart.app/");
	        driver.findElement(By.xpath("//body//div[@id='app']")).click();
	        WebElement ele = driver.findElement(By.className("pay"));
	        
	        Actions action = new Actions(driver);
	        action.moveToElement(ele).perform();

	}

}
