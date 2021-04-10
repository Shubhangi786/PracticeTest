package TutorialPointTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TutorialsPoint.pages.*;
import Utilities.TestBase;

public class ValidateLogo extends TestBase {
	HomePage homepage;
	public ValidateLogo() {
		super();
		
	}
	@BeforeMethod
	public void initBrowser() {
		init("chrome");
		homepage = new HomePage();
	}
	@Test
	public void validateLogo() throws InterruptedException {
		homepage.clickOnJvatpontLogo();
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("End");
	}

}
