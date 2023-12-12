import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegisterUser {

	public static void main(String[] args) {
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
		driver.findElement(By.className("dropdown-content")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[4]")).click();
        driver.findElement(By.className("jq_signup_open")).click();

	}

}
