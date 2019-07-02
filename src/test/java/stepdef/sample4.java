package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class sample4 {
	WebDriver driver;
	
	@Test(priority=1)
	@Given("app displays welcome message")
	public void app_displays_welcome_message() {
	   System.out.println("displays welcome message");
	   driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		// sigin page
		WebElement signin = driver.findElement(By.linkText("SignIn"));
		signin.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
	@Test(priority=2)
	@Given("user un and psd")
	public void user_un_and_psd() {
	   System.out.println("user enters un and psd ");
	   //WebElement uname = driver.findElement(By.id("userName"));
		//uname.sendKeys("lalitha");
	   pageobject loginpage=PageFactory.initElements(driver, pageobject.class);
	   pageobject.uname.sendKeys("lalitha");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//WebElement pwd = driver.findElement(By.id("password"));
		//pwd.sendKeys("password123");
		pageobject.psd.sendKeys("password123");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//WebElement login = driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		//login.click();
		pageobject.ok.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
	@Test(priority=3)

	@Given("click sigin")
	public void click_sigin() {
	  System.out.println("click signin ");
	}
	@Test(priority=4)

	@When("user searches for iphone")
	public void user_searches_for_iphone() {
	  System.out.println("user enters the search product");
	}

	
	@Test(priority=5)
	@When("user adding the searched product to cart")
	public void user_adding_the_searched_product_to_cart() {
		System.out.println("adding the searched product to cart");
		WebElement search = driver.findElement(By.id("myInput"));
		search.sendKeys("Headphone");
		WebElement find = driver.findElement(By.xpath("/html/body/div[1]/form/input"));
		find.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebElement cart = driver.findElement(By.xpath("html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
		cart.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		
		//ADDTOCARTPAGE2
		WebElement logo = driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]"));
		logo.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebElement chk=driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a"));
		chk.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	  
	}

	@Test(priority=6)
	
	@When("user performing payment process using netbanking")
	public void user_performing_payment_process_using_netbanking() {
		System.out.println("payment process ");
		//REVIEW AND PAYMENT
		WebElement pay=driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input"));
		pay.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		//NETBANKING
		WebElement bank=driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label"));
		bank.click();
		WebElement con=driver.findElement(By.xpath("//*[@id='btn']"));
		con.click();
		
		
		//NETBANKING CREDENTIALS  PAGE
		WebElement netuname=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input[1]"));
		netuname.sendKeys("123456");
		WebElement netpsd=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input[2]"));
		netpsd.sendKeys("Pass@456");		
		WebElement netlogin=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input"));
		netlogin.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS); 
	 	
		
		//TRANSACTION SUMMARY
		WebElement trans=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input"));
		trans.sendKeys("Trans@456");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS); 
		WebElement paynow=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input"));
		paynow.click();
		WebElement order=driver.findElement(By.xpath("html/body/b/section/div/div/div/div[2]/p"));
		String ord=order.getText();
		System.out.println(ord);
		Assert.assertEquals(ord, "Your order has been confirmed");
		
	  
	}
	@Test(priority=7)
	@When("user performing logout from online shopping cart")
	public void user_performing_logout_from_online_shopping_cart() {
	   System.out.println("user clicks on logout button");
	   WebElement signout=driver.findElement(By.xpath("html/body/header/div/div/ul/b/a[2]"));
		signout.click();
	}
	
	
	@BeforeTest
	public void configureBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterTest
	public void closeApplication(){
		driver.close();
	}
/*	@BeforeMethod
	public void pageFactory(){
		pageobject loginpage=PageFactory.initElements(driver, pageobject.class);
	}*/
	

}
