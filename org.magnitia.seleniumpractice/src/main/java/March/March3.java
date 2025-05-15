package March;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class March3 {

	public static void main(String[] args) {
		  
		WebDriver driver = new ChromeDriver();
		
		//get handle value of that browser window
		
		String x = driver.getWindowHandle();
		
		System.out.println(x);
		
		driver.close();

	}

}
