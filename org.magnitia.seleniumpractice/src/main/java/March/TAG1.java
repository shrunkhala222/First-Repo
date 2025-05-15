package March;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAG1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//count all the links from a webpage
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		//count all the Images from a webpage
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		
		//count all the elements from a webpage
		List<WebElement> Allelements = driver.findElements(By.xpath("//*"));
		
		System.out.println(Links.size());
		System.out.println(Images.size());
		System.out.println(Allelements.size());
		
		
		
		
		
		
		
		
		

	}

}
