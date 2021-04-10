package TutorialsPoint.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[text()='Apps']")
	WebElement dataType;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnJvatpontLogo() {
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		
		dataType.click();
		System.out.println(driver.getTitle());
		System.out.println("TestCase Passed");
	}

}
