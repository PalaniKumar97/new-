package BOTemplate_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WalletHistory {
	WebDriver driver;
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		String baseUrl="https://www.google.com";
		driver.get(baseUrl);
		
	//1.Navigate into Url and Login
		driver.navigate().to("https://demotestivps.com/botemplate/bo/login/");
		Thread.sleep(4000);
	    WebElement username=driver.findElement(By.id("user"));
	    username.sendKeys("admin");
	    Thread.sleep(4000);
	    WebElement pass=driver.findElement(By.id("pass"));
	    pass.sendKeys("123");
	    Thread.sleep(4000);
	    WebElement Login=driver.findElement(By.id("login"));
	    Login.click();
	    Thread.sleep(4000);
	    new WebDriverWait(driver,Duration.ofSeconds(30))
	    .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".swal2-confirm"))).click(); 
	    String actualUrl="https://demotestivps.com/botemplate/bo/Index/"; 
        String expectedUrl= driver.getCurrentUrl(); 
        Assert.assertEquals(expectedUrl,actualUrl);
        
        System.out.println("Excepted Url:"+expectedUrl);
        System.out.println("Actual Url:"+actualUrl);
		// Turn ON Manintaince
        driver.findElement(By.cssSelector("#content > div.layout-px-spacing > div > div > div > div > div > div.w-info.col-12.col-md-8 > button")).click();
        driver.findElement(By.cssSelector("body > div.swal2-container.swal2-center.swal2-fade.swal2-shown > div > div.swal2-actions > button.swal2-confirm.swal2-styled")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("body > div.swal2-container.swal2-center.swal2-fade.swal2-shown > div > div.swal2-actions > button.swal2-confirm.btn-success.waves-effect.waves-light.swal2-styled")).click();
        Thread.sleep(4000);
        
        //Turn OFF Maintaince
        driver.findElement(By.cssSelector("#content > div.layout-px-spacing > div > div > div > div > div > div.w-info.col-12.col-md-8 > button")).click();
        driver.findElement(By.cssSelector("body > div.swal2-container.swal2-center.swal2-fade.swal2-shown > div > div.swal2-actions > button.swal2-confirm.swal2-styled")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("body > div.swal2-container.swal2-center.swal2-fade.swal2-shown > div > div.swal2-actions > button.swal2-confirm.btn-success.waves-effect.waves-light.swal2-styled")).click();
    
	  
	   driver.close();
		}
	@Test
	public void testcase1() throws InterruptedException {
		 driver.findElement(By.cssSelector("#walletMenu > div > span")).click();
		driver.findElement(By.cssSelector("#userType")).click();
		   Thread.sleep(4000);
		   driver.findElement(By.cssSelector("#userType > option:nth-child(2)")).click();
		   Thread.sleep(4000);
		   driver.findElement(By.cssSelector("#select2-user_id-container > span")).click();
		   Thread.sleep(4000);
		   Thread.sleep(4000);
		   WebElement User_ID= driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"));
		   User_ID.click();
		   User_ID.sendKeys("testC008");
		   Thread.sleep(4000);
		   WebElement selected_user= driver.findElement(By.cssSelector("#select2-user_id-results > li"));
		   selected_user.click();
		   Thread.sleep(4000);
		   driver.findElement(By.cssSelector(".btn")).click();
		   Thread.sleep(4000);
		   driver.findElement(By.id("search")).click();
		   Thread.sleep(4000);
		driver.close();
	}
	}


