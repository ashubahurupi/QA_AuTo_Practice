package packTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveCurrentUrl {
	
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("link2")).click();
		
	String 	url=driver.getCurrentUrl();
		
		System.out.println(url);
	}

}
