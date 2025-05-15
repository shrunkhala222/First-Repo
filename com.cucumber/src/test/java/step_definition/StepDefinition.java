package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver;

@Given("user is on login page")
public void user_is_on_login_page() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    
}

@When("user enter valid credentials\\(usename: {string}, password: {string}")
public void user_enter_valid_credentials_usename_password(String string, String string2) {
	driver.findElement(By.xpath("//input[@name"));
}

@And("click on the login button")
public void click_on_the_login_button() {
	System.out.println("Clicked on Login Btn");
}

@Then("user is navigated to Home page")
public void user_is_navigated_to_home_page() {
	System.out.println("Navigated to Home Page");
}

@And("close the browser")
public void close_the_browser() {
	System.out.println("Browser Closed");
}


}
