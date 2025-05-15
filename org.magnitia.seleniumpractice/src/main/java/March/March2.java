package March;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class March2 {

	public static void main(String[] args) throws Exception {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
           Thread.sleep(5000);
           // get current url of the page 
           
           String x = driver.getCurrentUrl();
           
           if ( x.startsWith ("https"))
        	   
           {
        	   System.out.println("Secured site");
           }
           
           else 
           {
        	   System.out.println("Site is not secured");
           }
	}
	

}
