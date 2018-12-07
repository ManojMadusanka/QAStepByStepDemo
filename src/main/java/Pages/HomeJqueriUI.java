package Pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomeJqueriUI extends TestBase{

	DraggablePage draggablePage;
	
	@FindBy(xpath="//a[contains(text(),\"Droppable\")]")
	WebElement mnuDraggable;
	
	public HomeJqueriUI() {
		
PageFactory.initElements(webDriver, this);

}
	
	public DraggablePage navigateTODraggablePage() {
		
		mnuDraggable.click();
		return new DraggablePage();
		
	}
    
	
}
