package March;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	
		
		String x = driver.getTitle();
		
		System.out.println( "Title is" +  x);
		

	}

}
