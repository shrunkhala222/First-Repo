package org.magnitia.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
    driver.manage().window().maximize();
       
    //switch to third frame
    
    WebElement frame3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
    driver.switchTo().frame(frame3);
      driver.findElement(By.xpath("// input [@name= 'mytext3']")).sendKeys("This is Third frame");

      //switch to inner frame/nested frame (inner frame is available inside the third frame)
       
      driver.switchTo().frame(0);
      driver.findElement(By.xpath(" //div[ @class='AB7Lab Id5V1']")).click();
      
     
      
	}

}
