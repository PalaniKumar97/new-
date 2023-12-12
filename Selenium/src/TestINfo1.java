import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class TestINfo1 {

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
		driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/p[1]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/p[2]")).click();
		driver.findElements(By.xpath("//*[@id=\"other\"]/div/div/div/div[4]"));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"other\"]/div/div/div/div[4]/a[1]")).click();
		Thread.sleep(4000);
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("palanikumar2697@yahoo.com");
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("Testuser@123");
		WebElement Login=driver.findElement(By.id("loginbutton"));
		Login.click();
	
	  WebElement dropdown=driver.findElement(By.id("current_country"));
	  Select Country=new Select(dropdown);
	  Country.selectByVisibleText("Indonesia");
	  Country.selectByValue("101");
	
		
	  // driver.findElement(By.xpath("//*[@id=\"other\"]/div/div/div/div[6]/div/button")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"other\"]/div/div/div/div[6]/div/button")).click();
		
	//WebElement Skip=driver.findElement(By.xpath("//*[@id=\"basic\"]/div[5]/div[1]"));
		//Skip.click();
	  
		//driver.findElement(By.xpath("//*[@id=\"basic\"]/div[5]/div[1]/button")).click();
		//driver.findElement(By.id("pickup_jobsp_ms")).click();
		
	    //driver.findElement(By.xpath("//*[@id=\"basic\"]/div[5]/div[1]")).click();
		
		//WebElement dropdown=driver.findElement(By.name("nationality_id"));
		//Select select=new Select(dropdown);
		//select.selectByVisibleText("Select nationality");
		//select.selectByValue("87");
		
	
		
		
	}

}
