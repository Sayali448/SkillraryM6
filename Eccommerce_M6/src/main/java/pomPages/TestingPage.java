package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
//declaration
	@FindBy(xpath ="(//a[text()-'Selenium Training')[2]")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement carttab;
	//@FibdBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	//initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public  WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	public  WebElement getCarttab() {
		return carttab;
	}
	public  WebElement getFacebook() {
		return facebook;
	}
	public  void Facebookion() {
		 facebook.click();
	}
}
