package GenericLiabraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	//generic method for mouseover
	public void mouseOvering(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//generic method for right click
	
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	//generic method for double click
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//generic method for mouseover
	public void doubleClick(WebDriver driver, WebElement ele1, WebElement ele2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	
	//generic method for dropdown
	
	public  void dropDown(WebElement ele,String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
//generic method to handle a frame
	public  void switchframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
		//generic method to shift control back to normal web page
		
	public  void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	//generic method for implicit wait
	public void implicitWaitMethod(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	//generic methods for frames
	public  void alterPopUpAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	//generic method for parent window
	public  void parentWindow(WebDriver driver) {
		driver.getWindowHandle();
	
	}
	//shifting control to  child window
	public  void switchingtabs(WebDriver driver) {
		Set<String>child = driver.getWindowHandles();
		for(String b:child) {
		driver.switchTo().window(b);
		}
	}
	//handling drag and drop
	public void dragdrop(WebDriver driver, WebElement src,WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src,target).perform();
	}
	//shifting control to pop up
	
	public  void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void scrollBar(WebDriver driver,int x,int y){
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy("+x+","+y+")");
		
	}
	

}

