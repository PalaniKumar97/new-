import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;  

public class LoginUser {

	public static void main(String[] args) throws IOException, Throwable {
	// Setting property of Chrome driver with path
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// Instantiate Web Driver
		WebDriver driver =new ChromeDriver(options);
		//Launch Google Browser
		driver.navigate().to("http://www.google.com/");
		// launch snatchjobs job portal
		driver.findElement(By.name("q")).sendKeys("snatchjobs"+Keys.ENTER);
		driver.navigate().to("https://indonesia-snatchjobsv2.showdemo.io/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[5]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[5]"))
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[5]/div")).click();
		driver.findElement(By.className("dropdown-content")).click();
		//driver.findElement(By.className("fa fa-globe dropbtn")).click();

		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[4]")).click();
		WebElement email =driver.findElement(By.name("email"));
		WebElement password=driver.findElement(By.name("password"));
		email.sendKeys("palanikumar1284@gmail.com");
		password.sendKeys("123@");
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
		driver.findElement(By.name("email")).sendKeys("palanikumar1284@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123@");
		Thread.sleep(4000);
	
		//driver.findElement(By.name("q")).sendKeys("snatchjobs"+Keys.ENTER);
	    //driver.findElement(By.linkText("Google Search")).click();
		
		//driver.findElement(By.className("dropdown")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[5]/div")).click();
		
		
		
	}

}
