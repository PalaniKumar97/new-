package New_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		String baseUrl="https://www.google.com";
		driver.get(baseUrl);
		driver.navigate().to("https://demotestivps.com/botemplate/bo/login/");
		Thread.sleep(4000);
        WebElement username=driver.findElement(By.id("user"));
        username.sendKeys("admin");
        Thread.sleep(4000);
        WebElement pass=driver.findElement(By.id("pass"));
        pass.sendKeys("123");
        WebElement Login=driver.findElement(By.id("login"));
        Login.click();
       
        
       
	}

}
