package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import utilities.UtilityCustomFunctions;

public class HomePage extends BasePage {
	public HomePage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle nav-link dropdown-user-link']//img")
	WebElement eleAvatar;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement eleLogout;
	
	
	
	//IsMethods
	public boolean isAvatarDisplayed() {
		boolean bFlag = false;
		bFlag = UtilityCustomFunctions.IsElementVisible(Adriver, eleAvatar);
		return bFlag;
	}
	
	//Click Methods
	public void clickAvatar() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, eleAvatar);
	}
	
	public void clickLogout() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, eleLogout);
	}
	
}
