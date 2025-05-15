package March;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOC4 {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(3000);

		int Expected_icons = 7;
		
		List<WebElement> TOPICONS = driver.findElements(By.className("list-inline-item"));
		
		int Actualicons = TOPICONS.size();
		
		System.out.println(Actualicons);
		
		if (Expected_icons == Actualicons)
		{
			System.out.println("ICONS count is matching");
		}
		else
		{
			System.out.println("ICONS count is not  matching");
		}
		
	}

}
