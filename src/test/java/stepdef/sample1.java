package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample1 {
	WebDriver driver;
	@Test
	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
	   // System.out.println("user opens newtour login page");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		// sigin page
		WebElement signin = driver.findElement(By.linkText("SignIn"));
		signin.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		// login page
		
		
		
	}

	@When("user enters username as mercury and password as mercury")
	public void user_enters_username_as_mercury_and_password_as_mercury() {
		//System.out.println("user enters username and password");
		WebElement uname = driver.findElement(By.id("userName"));
		uname.sendKeys("lalitha");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("password123");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@When("Click on Submit button")
	public void click_on_Submit_button() {
		WebElement login = driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		login.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//System.out.println("user verifies the login page");
	}

	@Then("verify login success")
	public void verify_login_success() {
	  System.out.println();
	}
	@BeforeTest
	public void configureBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	



}
