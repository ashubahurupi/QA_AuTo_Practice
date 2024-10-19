package packTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeachBoxDemo {
	
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@class='gsc-input']"));
		searchBox.sendKeys("Ashish");
		
		WebElement searchButton=driver.findElement(By.xpath("//td[@class='gsc-search-button']"));
		searchButton.click();
		
		String SearchResult=driver.findElement(By.xpath("//div[text()='No posts matching the query: ']")).getText();
		System.out.println(SearchResult);
		
		
	}

}
