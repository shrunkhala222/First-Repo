package March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//tag#id 
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Jeans");
		
		//tag.classname
		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Jeans");
		
		//tag[attritube = 'value']
	/*	driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Jeans");
		
		//tag.class[attribute='value']
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Jeans");*/
		
		

	}

}
