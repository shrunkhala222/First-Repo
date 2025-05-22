package step_definition_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition2 {
	WebDriver driver;
	@Given("user in on OrangeHRM Login page")
	public void user_in_on_orange_hrm_login_page() {
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
	}

	@When("user enter valid username:{string} and password:{string}")
	public void user_enter_valid_username_and_password(String Username, String password) {
	    driver.findElement(By.name("username")).sendKeys(Username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() throws InterruptedException 
	{
	 driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click(); 
	 Thread.sleep(2000);
	}

	@Then("user should redirect to the dashboard page")
	public void user_should_redirect_to_the_dashboard_page() 
	{
		
	   boolean status = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	    Assert.assertEquals(status, true);
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.quit();
		
	}
}
