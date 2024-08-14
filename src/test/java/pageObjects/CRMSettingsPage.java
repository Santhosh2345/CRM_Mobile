package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import utilities.UtilityCustomFunctions;
	public class CRMSettingsPage extends BasePage{
	public CRMSettingsPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="(//a[@class='dropdown-item'])[3]")
	WebElement mnuCRMSetting;
	
	@FindBy(xpath="//label[normalize-space()='Other Settings']")
	WebElement mnuOtherSetting;
	
	@FindBy(xpath="//label[normalize-space()='Workflow']")
	WebElement mnuItemWorkflow;

	
	
	
	//Click Methods
	public void clickMnuItemWorkflow() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, mnuItemWorkflow);
	
	}
	public void clickMnuOtherSetting() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, mnuOtherSetting);
	
	}
	public void clickMnuCRMSetting() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, mnuCRMSetting);
	}
	
	
}
