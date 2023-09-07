package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
//declaration 
	//address  of + icon
	@FindBy(id="add")
	private WebElement addbtn;
	//address of add to cart button
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement cartbtn;
	//initialization
	public AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getAddbtn() {
		return addbtn;
	}
	public void carttocartbtn() {
		cartbtn.click();
	}
}
