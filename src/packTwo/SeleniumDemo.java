package packTwo;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
		driver.get("https://omayo.blogspot.com/");
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
	}

}
