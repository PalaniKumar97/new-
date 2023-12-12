import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","home/sg/Downloads/ChromeDriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("www.google.com");
		driver.navigate().to("https://indonesia-snatchjobsv2.showdemo.io/");
		
	}

}