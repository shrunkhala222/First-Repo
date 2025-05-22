package org.magnitia.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		  //driver.switchTo().frame(WebElement)
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
		
      driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("// input [@name= 'mytext1']")).sendKeys("This is First frame");
		
	}

}
