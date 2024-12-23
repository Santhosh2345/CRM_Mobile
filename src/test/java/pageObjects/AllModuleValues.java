package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import utilities.UtilityCustomFunctions;
public class AllModuleValues extends BasePage{

	public AllModuleValues(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle nav-link dropdown-user-link']//img")
	WebElement eleAvatar;

	public void clickModule(String sModuleName) throws Exception {
		String sXpath="//button[normalize-space()='" + sModuleName + "']"; 
		WebElement eleModuleData = Adriver.findElement(By.xpath(sXpath));
		UtilityCustomFunctions.doClick(Adriver, eleModuleData);
		
	}
	
	
}
