package packTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextCommands {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String titleOfThePage = driver.getTitle();
		
		System.out.println(titleOfThePage);
		WebElement webtext = driver.findElement(By.id("pah"));
		String webTextactual = webtext.getText();
		
		System.out.println(webTextactual);
		
		driver.quit();
	}

}
