package TestCategeories;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DraggablePage;
import Pages.HomeJqueriUI;

public class TestDragAndDropWithMovements extends TestBase{
	
	HomeJqueriUI hmPage;
	DraggablePage DrpPage;
	
	public TestDragAndDropWithMovements() {
        super();
}

	@BeforeMethod
	public void StartDriver() {
		Initialization();
		hmPage=new HomeJqueriUI();
		
		DrpPage=new DraggablePage();
		DrpPage=hmPage.navigateTODraggablePage();
		
	}
	@Test(priority=1)
	public void Dropped() {
		
		DrpPage.ClickedToDraggablePage();
	}
	
	@AfterMethod
	public void StopDriver(){
		
		webDriver.quit();
		
	}
}
