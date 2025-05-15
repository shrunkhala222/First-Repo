package March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISENABLED {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/registar");
		driver.manage().window().maximize();
		
		//Method -1
		/* WebElement Searchbox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		 System.out.println("Enabled Status of the Searchbox is " + Searchbox.isEnabled());*/
		 
		 //Method-2
		 boolean Status = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).isEnabled();
		 System.out.println("Enabled Status of the Searchbox is " + Status);
		 

	}

}
