package Selenium_Tutorial;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class JavatpointTest {
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
  public void javatpoint() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1920, 1040));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("javatpoint");
    driver.findElement(By.cssSelector("#jZ2SBf b")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
    js.executeScript("window.scrollTo(0,717)");
    driver.findElement(By.linkText("Selenium")).click();
    js.executeScript("window.scrollTo(0,243)");
    driver.close();
  }
}
