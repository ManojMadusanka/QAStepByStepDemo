package Pages;



import java.awt.Desktop.Action;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import bsh.This;

public class DraggablePage extends TestBase {

	
	@FindBy(xpath="//div[@id=\"draggable\"]")
	WebElement source;
	
	@FindBy(xpath="//div[@id=\"droppable\"]")
	WebElement target;
	
	public DraggablePage() {
		PageFactory.initElements(webDriver, this);
	}
	
	public void ClickedToDraggablePage() {
		webDriver.switchTo().frame(0);
		Actions actions=new Actions(webDriver);
		actions.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
			}
	
}
