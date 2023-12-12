package Selenium_Tutorial;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class LoginTestTest {
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginTest() {
    driver.get("https://indonesia-snatchjobsv2.showdemo.io/");
    driver.manage().window().setSize(new Dimension(830, 1040));
    driver.findElement(By.linkText("Login / Sign up")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("palanikumar2697@yahoo.com");
    driver.findElement(By.id("jobseeker-password")).click();
    driver.findElement(By.id("jobseeker-password")).sendKeys("Testuser@123");
    driver.findElement(By.cssSelector(".mb-7 .jobseeker-view-icon")).click();
    driver.findElement(By.id("loginbutton")).click();
    driver.findElement(By.cssSelector(".wl-name > strong")).click();
    driver.findElement(By.linkText("Log out")).click();
    driver.findElement(By.cssSelector(".swal2-confirm")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#loggedOutSuccessfullyModal .yellow-btn"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("#loggedOutSuccessfullyModal .close-icon > img")).click();
    driver.close();
  }
}
