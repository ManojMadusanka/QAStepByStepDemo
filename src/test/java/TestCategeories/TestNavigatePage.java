package TestCategeories;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import net.bytebuddy.implementation.bind.annotation.Super;

public class TestNavigatePage extends TestBase{

	public TestNavigatePage() {
            super();
}
	
	@BeforeMethod
	public void SetUp() {
		
		Initialization();
		webDriver.get(properties.getProperty("urlDefault"));
			}
	@Test(priority=1)
	public void NavigatePage() throws InterruptedException {
		
		webDriver.navigate().to(properties.getProperty("urlToNavigate"));
		Thread.sleep(3000);
		webDriver.navigate().back();
		Thread.sleep(3000);
		webDriver.navigate().forward();
		Thread.sleep(3000);
		
	}
	
	/*@Test(priority=2)
	public void Backward() throws InterruptedException {
		webDriver.navigate().back();
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void Forword() throws InterruptedException {
		webDriver.navigate().forward();
		Thread.sleep(3000);

	}
	
	*/
	@AfterMethod
	public void Quit() {
		webDriver.quit();
	}
}
