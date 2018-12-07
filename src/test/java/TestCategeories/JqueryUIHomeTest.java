package TestCategeories;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomeJqueriUI;

public class JqueryUIHomeTest extends TestBase {
	
	
	HomeJqueriUI hmPage;
	public JqueryUIHomeTest() {
super();
}
	
	@BeforeMethod
	public void StartDriver() {
		Initialization();
		hmPage=new HomeJqueriUI();
				
	}
	
	@Test(priority=1)
	public void ClickDroppableLink() {
		hmPage.navigateTODraggablePage();
	}
	
	@AfterMethod
	public void stopDriver() {
		webDriver.quit();
	}
}
