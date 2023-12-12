import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		String url=("https://www.google.com/");
		driver.get(url);
		String actualUrl=driver.getCurrentUrl();
        
        if(actualUrl.equals("https://www.google.com/")) {
        	System.out.println("Verification Successfull");
        }
        	else {
        		System.out.println("Verification Failed due to invalid url");
        	}
        String pagesource=driver.getPageSource();
        	int pagesourcelength=pagesource.length();
        	
        	System.out.println("Total length of Page Source:"+pagesourcelength);
        	driver.close();
        }
	}


