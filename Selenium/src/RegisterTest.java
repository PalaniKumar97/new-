
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class RegisterTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		String baseUrl="https://www.google.com";
		driver.get(baseUrl);
		System.out.print(driver.getCurrentUrl());
		driver.navigate().to("https://indonesia-snatchjobsv2.showdemo.io/");
		Thread.sleep(4000);
		driver.findElement(By.className("dropdown")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/p[2]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/p[2]")).click();
		driver.findElements(By.xpath("//*[@id=\"other\"]/div/div/div/div[4]"));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"other\"]/div/div/div/div[4]/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"loginmodel\"]/div[4]/a")).click();
        Thread.sleep(4000);
        WebElement Firstname=driver.findElement(By.id("first_name"));
		Firstname.sendKeys("Pazhani Kumar");
		WebElement Lastname=driver.findElement(By.id("last_name"));
		Lastname.sendKeys("K S");
		WebElement Email=driver.findElement(By.id("jobseekeremail"));
		Email.sendKeys("palanikumar2697@gmail.com");
		Select Country=new Select(driver.findElement(By.id("country_id")));
		Country.selectByVisibleText("Indonesia");
		Country.selectByIndex(102);
		driver.findElement(By.xpath("//*[@id=\"jobseeker-signup\"]/div[1]/div[2]/div[1]/div/div/div/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"iti-1__item-in\"]/div")).click();
		WebElement PhoneNumber=driver.findElement(By.id("jobseeker_mobile_no"));
		PhoneNumber.sendKeys("8270172314");
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Testuser@123");
		WebElement ConfirmPassword=driver.findElement(By.id("confirm_password"));
		ConfirmPassword.sendKeys("Testuser@123");
        driver.findElement(By.id("g-recaptcha")).click();
        Thread.sleep(8000);
        WebElement SignUp=driver.findElement(By.id("registersubmit"));
	    SignUp.click();
		
	}

}
