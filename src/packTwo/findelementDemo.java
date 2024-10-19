package packTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementDemo {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
//		WebElement inputArea = driver.findElement(By.id("ta1"));
//		inputArea.sendKeys("Ashish bahurupi");
//		
//		
//		// alert1	
//		WebElement popUp = driver.findElement(By.id("alert1"));
//		popUp.click();
		
		WebElement olderNewsletter = driver.findElement(By.name("SiteMap"));
		olderNewsletter.click();
		
		//LinkText 
		
		WebElement link = driver.findElement(By.linkText("compendiumdev"));
		
		link.click();
	}

}
