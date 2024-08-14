package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import utilities.UtilityCustomFunctions;

public class CallsPage extends BasePage{

	public CallsPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@name='calls_callernumber']")
	WebElement txtCallerNumber;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement btnSearch;
	
	@FindBy(xpath="//span[@class='pagination_load']")
	WebElement lblPagination;
	
	@FindBy(xpath="//table[@class='table table-striped rowcount']/tbody")
	WebElement WbTblRow;
	
	//Set Methods
	public void setCallerNumber(String sPhoneNumber) {
		UtilityCustomFunctions.sendKeysNoEnter(Adriver, txtCallerNumber, sPhoneNumber);
	}
	//Click Methods
	public void clickSearch() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, btnSearch);
	}
	//Get Methods
	public String getPagination() throws Exception {
		return UtilityCustomFunctions.getText(Adriver, lblPagination);
	}
	
	public int getCallsRowcount() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> tRowCount = WbTblRow.findElements(By.tagName("tr"));
		UtilityCustomFunctions.logWriteConsole("Calls Count:" + tRowCount.size());
		return tRowCount.size();
	}
	
}

