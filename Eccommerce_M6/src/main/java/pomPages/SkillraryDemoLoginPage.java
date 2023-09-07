package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
private static final String xpath = null;
	//declaration
	//address of selenium training
	@FindBy(xpath ="(//a[text()-'Selenium Training')[1]")
	private WebElement seleniumtraining;
	//address of dropdown
	@FindBy(name="addresstype")
	private WebElement coursedd;
	//initialization
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getCoursetab() {
		return coursedd;
	}
	public void seleniumtrainingtab() {
		seleniumtraining.click();
		
	}
	public WebElement getCoursedd() {
		return coursedd;
	}
}
