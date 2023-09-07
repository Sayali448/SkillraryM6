package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
//Declaration
	//address of gears
	@FindBy(xpath="//a[text()='GEARS']")
	private WebElement gearbtn;
	//address of skillrary demo
	@FindBy(xpath="//a[text()='SkillraryDemo App'])[2]")
	private WebElement skillrarydemoapp;
	//address of search textfield
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//initialization
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void gearsbutton() {
		gearbtn.click();
	}
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name) {
		searchtb.sendKeys(name);
	}
	public void gobutton() {
		searchbtn.click();
	}
}
