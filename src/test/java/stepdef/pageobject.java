package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobject {
  //create a instance for WebDriver
	static WebDriver driver;
	//constructor
	///public pageobject(){
		//PageFactory.initElements(driver, this);
//	}
	//identify elements 
	@FindBy(name="userName") public static WebElement uname;
	@FindBy(name="password") public static WebElement psd;
	@FindBy(xpath="//input[@name='login']") public static WebElement ok;
}
