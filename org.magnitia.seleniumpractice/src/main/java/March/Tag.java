package March;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		List<WebElement>  Links = driver.findElements(By.tagName("img"));
		
		List<WebElement> Allelements = driver.findElements(By.xpath("//*"));
		
		System.out.println(Links.size());
		System.out.println(Allelements.size());
		
		
		
		
		
		
	}

}
