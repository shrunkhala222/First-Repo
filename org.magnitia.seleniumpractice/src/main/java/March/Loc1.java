package March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.LinkText("Create new account")).click
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shrunkhala222@gmail.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")))
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345678");
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"u_0_5_qq\"]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"u_0_2_bN\"]/div[3]")).click();
Thread.sleep(2000);

	}

}
