package org.magnitia.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
    driver.manage().window().maximize();
     
    //switch to first frame
    WebElement frame1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
	        driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("// input [@name= 'mytext1']")).sendKeys("This is First frame");
		
		//switch from first frame to parent window/Default content
		driver.switchTo().parentFrame();
		
		//switch to second frame
		 WebElement frame2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
	        driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("// input [@name= 'mytext2']")).sendKeys("This is Second frame");
		
		//switch from second frame to parent window 
	driver.switchTo().defaultContent();
	
	//switch to third frame
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
    driver.switchTo().frame(frame3);
      driver.findElement(By.xpath("// input [@name= 'mytext3']")).sendKeys("This is Third frame");

    driver.switchTo().defaultContent();

	
   
	}

}
