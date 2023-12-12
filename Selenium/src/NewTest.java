import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// Instantiate Web Driver
		WebDriver driver =new ChromeDriver(options);
		//Launch Google Chrome
		driver.get("https://www.google.com/");
		//Navigate to Snatchjobs JObseeker Portal
		driver.navigate().to("https://indonesia-snatchjobsv2.showdemo.io/");
		//Selecting the language
		//driver.findElement(By.className("dropdown")).click();
		//driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/p[1]")).click();
		//Click on Login/SignUp 
		//driver.findElement(By.xpath("//*[@id=\"other\"]/div/div/div/div[4]/a[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div/div[1]/form/div[1]")).sendKeys("palanikumar@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test0001@gmail.com");
		//WebElement element =driver.findElement(By.name("email"));
		//element.sendKeys("test001@gmail.com");
	}

}
