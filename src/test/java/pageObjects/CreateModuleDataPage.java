package pageObjects;

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import utilities.UtilityCustomFunctions;
public class CreateModuleDataPage extends BasePage{
	public static List<WebElement> objLists;
	public CreateModuleDataPage(AndroidDriver Adriver) {
		super(Adriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[@id='select2-assign_to-1y-container']")
	WebElement eleSelectAssignedTo;
	
	@FindBy(id="select2-assign_to-r1-container")
	WebElement eleClickAssignedTo;
	
	
	
	@FindBy(xpath="//input[@name='crmeditfieldmodule_phonenumber']")
	WebElement eletxtPhoneNumber;
	
	@FindBy(xpath="//input[@type='number' and @name='crmeditfieldmodule_numberfield']")
	WebElement eletxtNumberField;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement eletxtMobileNumber;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement eletxtEmail;
	
	@FindBy(xpath="//span[@id='select2-selfield_5803-container' and @class='select2-selection__rendered']")
	WebElement eleSelectMnuList;
	
	@FindBy(xpath="//ul[@class='select2-results__options' and @role='tree']")
	WebElement eleUlSelect;
	
	@FindBy(xpath="//span[@role='combobox']//ul")
	WebElement eleMultiSelect;
	
	@FindBy(xpath="//input[@role='textbox']")
	WebElement eleMnuTextBox;
	
	@FindBy(xpath="//input[@type='number' and @name='crmeditfieldmodule_enteryournumber']")
	WebElement txtEnterYourNumber;
	
	
	@FindBy(xpath="//*[@id='select2-selfield_5803-container']")
	WebElement txtMnuList;
	
	@FindBy(xpath="//ul[@class='select2-selection__rendered']")
	WebElement txtMultiComboBox;
	
//	@FindBy(xpath="//span[@class='select2-selection select2-selection--multiple']")
//	WebElement txtMultiComboBox;
	
	@FindBy(xpath="//*[@id='select2-selfield_5803-results' and @role='tree']")
	WebElement eleMnuUl;
	
	@FindBy(xpath="//div[@class='form-actions right']//button[@type='submit'][normalize-space()='Save']")
	WebElement btnSave;
	
	@FindBy(xpath="//a[normalize-space()='Close']")
	WebElement btnClose;
	
	@FindBy(xpath="//div[@class='daterangepicker ltr single opensright show-calendar']//button[@type='button'][normalize-space()='Apply']")
	WebElement DandTApply;
	
	@FindBy(xpath="//input[@id='upload_0_crmmodonlyonfirstsave_file']")
	WebElement eleUploadFile;
	
	@FindBy(xpath="//span[@id='select2-selfield_5893-container']")
	WebElement eleEnqCatText;
	
	@FindBy(xpath="//span[@id='select2-selfield_6068-container']")
	WebElement eleSchedEnqCatg;
	
	
	
	
	@FindBy(xpath="(//i[contains(@class,'fa fa-edit')])[1]")
	WebElement eleEllipsisEdit;
	
	@FindBy(xpath="//button[normalize-space()='edit_square']")
	WebElement eleEditButton;
	
	@FindBy(xpath = "//ul[@class='select2-selection__rendered']/li/span")
	List<WebElement> lstMultiCombo;
	
	
	
	
	public void fRemMultiComboValues() throws InterruptedException {
		System.out.println("Inside remove existing values:");
		int iCount = lstMultiCombo.size();
		System.out.println("Multicombo: count" + iCount);
		if(iCount>0) {
			for(int i = iCount-1;i>=0;i--) {
				System.out.println("iCount Value within each iteration:" + i + ":"+ iCount);
				Thread.sleep(3000);
//				txtMultiComboBox.click();
				lstMultiCombo.get(i).click();
				Thread.sleep(1000);
			}
				
		}
		else {
			txtMultiComboBox.click();
		}
	}
	
	public void clickAssignedTo() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, eleClickAssignedTo);
	}
	
	public void clickEditRecord() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, eleEllipsisEdit);
	}
	
	public void clickEdit() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, eleEditButton);
	}
	
	public void clickEllipsis(int iEllipsisPos) throws InterruptedException {
		String sXpath = "(//i[@class='fa fa-ellipsis-v'])["+iEllipsisPos+"]";
		WebElement eEllipsis = Adriver.findElement(By.xpath(sXpath));
		Thread.sleep(1000);
		eEllipsis.click();
	}
	
	public void clickExistingModData(int iRowPos) throws InterruptedException {
		String sXpath = "(//td[@scope='row']/following-sibling::td)["+iRowPos+"]";
		WebElement eleModData = Adriver.findElement(By.xpath(sXpath));
		Thread.sleep(1000);
		eleModData.click();
	}
	public void clickDay(int iDateIndex) throws Exception {
		String sXpath="(//td[contains(@class,'today')])[" + iDateIndex + "]";
		UtilityCustomFunctions.logWriteConsole(sXpath);
		WebElement eleDate = Adriver.findElement(By.xpath(sXpath));
		Thread.sleep(1000);
		eleDate.click();
//		UtilityCustomFunctions.doClick(Adriver, eleDate);
	}
	public void clickEnqCategory() throws Exception {
//		UtilityCustomFunctions.doClick(Adriver, eleEnqCatText);
		UtilityCustomFunctions.doActionClick(Adriver, eleEnqCatText);
	}
	//get Methods
	public void clickSchedEnqCategory() throws Exception{
		UtilityCustomFunctions.doActionClick(Adriver, eleSchedEnqCatg);
	}
	public String fGetModuleText(String sModuleName,String sText) throws Exception {
		String sXpath = "//input[@type ='text' and @name='" + sModuleName.toLowerCase()+"_"+sText+"']";
		WebElement eleText = Adriver.findElement(By.xpath(sXpath));
		return UtilityCustomFunctions.getText(Adriver, eleText);
	}
	
	public String fGetModuleValue(String sModuleName,String sText) throws Exception {
		String sXpath = "//input[@type ='text' and @name='" + sModuleName.toLowerCase()+"_"+sText+"']";
		WebElement eleText = Adriver.findElement(By.xpath(sXpath));
		return UtilityCustomFunctions.getValue(Adriver, eleText);
	}
	
	public String fGetUploadFileName() {
		 WebElement fileName = Adriver.findElement(By.id("uploaded-files"));
		 return fileName.getText();
	}
	
	//click methods

	public void clickDandTApply() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, DandTApply);
	}
	public void clickTime(String sHours,String sMinues) throws Exception {
	Actions action = new Actions(Adriver);
	Thread.sleep(3000);	
	//String xPathHours = "//div[normalize-space()='" +sHours+ "']";
	String  xPathHours = "//div[@class='popover-content']//div[@class='clockpicker-tick' and text()='"+sHours+"']";
	UtilityCustomFunctions.logWriteConsole("Hours:" + xPathHours);
	WebElement eleHours = Adriver.findElement(By.xpath(xPathHours));
	eleHours.click();
	Thread.sleep(3000);
//	String xPathMinutes = "//div[normalize-space()='" +sMinues+ "']";
	String xPathMinutes = "//div[@class='popover-content']//div[@class='clockpicker-tick' and text()='"+sMinues+"']";
	WebElement eleMinutes = Adriver.findElement(By.xpath(xPathMinutes));
	eleMinutes.click();
//	UtilityCustomFunctions.doActionClick(Adriver, eleMinutes);
	Thread.sleep(3000);
	int  sSeconds = 55;
	String xPathSeconds = "(//div[@class='popover-content']//div[@class='clockpicker-tick' and text()='"+ sSeconds +"'])[2]";
	WebElement eleZeroZero = Adriver.findElement(By.xpath(xPathSeconds));
	Thread.sleep(2000);
//	action.doubleClick(eleZeroZero).build().perform();
	eleZeroZero.click();
//	UtilityCustomFunctions.doActionClick(Adriver, eleZeroZero);
	Thread.sleep(2000);
	
	}
	public void clickMultiComboBox(String sMS_Value) throws Exception {
			fRemMultiComboValues();


		System.out.println("After get attribute in combo box");
		Thread.sleep(3000);
		((JavascriptExecutor) Adriver).executeScript("arguments[0].scrollIntoView(true);", txtMultiComboBox);
		Thread.sleep(1000);
		System.out.println("Expected values:" + sMS_Value);
		String arrValues[]=sMS_Value.split(",");
		Thread.sleep(3000);
//		System.out.println("Array Lenght: " + arrValues.length);
		String sXpath = "//ul[@class='select2-results__options']//li[text()='"+arrValues[0]+"']";
		System.out.println(sXpath);
//		txtMultiComboBox.click();
		for(int i=0;i<arrValues.length;i++) {
//			txtMultiComboBox.click();
			Thread.sleep(3000);
			System.out.println("Inside outer for loop: expected values");
			Thread.sleep(3000);
			sXpath = "//ul[@class='select2-results__options']//li[text()='"+arrValues[i]+"']";
//			System.out.println(sXpath);
			WebElement eleMultiCombo = Adriver.findElement(By.xpath(sXpath));
			System.out.println("Multi Combo Print Values " + i + "Values:" + eleMultiCombo.getText());
			UtilityCustomFunctions.doActionClick(Adriver, eleMultiCombo);
//			UtilityCustomFunctions.doClick(Adriver, eleMultiCombo);
			Thread.sleep(3000);
			txtMultiComboBox.click();
		}
		
//			System.out.println("Size after click:" + objLists.size());
//			iListSize = objLists.size();
//			System.out.println("Multicombo List size before click again:" + iListSize);
//			if(iListSize==0) {
//				System.out.println("Inside if block when size 0");
//				txtMultiComboBox.click();
//			}
//			Thread.sleep(1000);
//			iListSize = objLists.size();
//			System.out.println("List size after combo box click after clear" + iListSize);
////			System.out.println("Multicombo List size:" + objLists.size());
//			System.out.println("First item:" + objLists.get(i).getText());
//			for(int j=0;j<iListSize;j++) {
//				System.out.println("Inside Inner for loop: " + objLists.get(j).getText());
//				System.out.println("acutal: " + objLists.get(j).getText().trim());
//				System.out.println("expected is: " + arrValues[i].trim());
////				objLists = Adriver.findElements(By.xpath("//li[@role='treeitem']"));	
//					 if (arrValues[i].equalsIgnoreCase(objLists.get(j).getText().trim())) {
//						 Thread.sleep(1000);
//						 System.out.println("actual vlaue:" +objLists.get(j).getText().trim());
//						 objLists = Adriver.findElements(By.xpath("//li[@role='treeitem']"));
////						 UtilityCustomFunctions.doActionClick(Adriver, objLists.get(j));
//						 UtilityCustomFunctions.doClick(Adriver, objLists.get(j));
//						 System.out.println(" Item selected in Multi combox Box : "+objLists.get(j));
//						 BaseClass.logger.info(" Item selected in Multi combox Box: "+objLists.get(j));
//						 Thread.sleep(3000);
//						 break;
//					 }//inner if
//					 	 
//			}//for loop of objList
//			System.out.println("After inner for loop");
//		}// for loop of array items.
//		System.out.println("After outer for loop");
//		txtMultiComboBox.sendKeys(Keys.ENTER);
	}
	
	
	
	//click Methods
	public void selectMenuValue(String sValue) {
		UtilityCustomFunctions.selectOneItemfromListBox(Adriver, eleMnuUl, sValue);
	}
	public void selectListValue(String sValue) {
		UtilityCustomFunctions.selectOneItemfromListBox(Adriver, eleUlSelect, sValue);
//		String sXpath = "//ul[@class='select2-results__options']//li[text()='" + sValue + "']";
	}
	public void selectListValue2(String sValue) {
		String sXpath = "//ul[@class='select2-results__options']//li[text()='" + sValue + "']";
		Adriver.findElement(By.xpath(sXpath)).click();
	}
	//click Methods
	public void clickSave() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, btnSave);
	}
	
	public void clickClose() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, btnClose);
	}
	public void clickSelectControl(String sModuleName,String sFieldLabel) throws Exception {
		String sXpath = "//select[@name='"+ sModuleName.toLowerCase() + "_" + sFieldLabel +"']";
		System.out.println("Select Control xpath:" + sXpath);
		WebElement elecomboxBox = Adriver.findElement(By.xpath(sXpath));
		UtilityCustomFunctions.doActionClick(Adriver, elecomboxBox);
	}
	public void clickMenuList(String sMenuItem) throws Exception {
		System.out.println("Before clicking MenuItem");
		boolean bFlag = UtilityCustomFunctions.IsElementVisible(Adriver, eleSelectMnuList);
		if(bFlag==true) {
//		UtilityCustomFunctions.doClick(Adriver, eleSelectMnuList);
		eleSelectMnuList.click();
		System.out.println("After clicking combobox");
		Thread.sleep(2000);
		
		}
		else {
		 System.out.println("Combo Box missing");	
		}
		
	}
	public void clickArrayDropDown(int iObjIndex) throws Exception {
		String sXpath="(//span[@class='select2-selection__rendered' and @role='textbox'])[" + iObjIndex + "]";
		WebElement eleDropDown = Adriver.findElement(By.xpath(sXpath));
//		UtilityCustomFunctions.doClick(Adriver, eleDropDown);
		eleDropDown.click();
	}
	
	public void clickArrayCheckBox(int iObjIndex,String sValue) {
		String xPath = "(//input[@type='checkbox'])[" + iObjIndex + "]";  
		WebElement eleCheckBox = Adriver.findElement(By.xpath(xPath));		
		if(sValue.equalsIgnoreCase("ON")) {
			if(eleCheckBox.isSelected()) {
				
			}
			else {
				eleCheckBox.click();
			}
		}
		else {
			if(eleCheckBox.isSelected()) {
				eleCheckBox.click();
			}
		}
	}
	
	//Select,Set Values
	public void setMobileNumber(String sNumber) {
		UtilityCustomFunctions.sendKeysNoEnter(Adriver,eletxtMobileNumber,sNumber);
	}
	
	public void ClickListPhonePrefix(String sModuleName,String sText) throws Exception {
	String sXpath = "//span[@id='select2-" + sModuleName.toLowerCase() + "_" + sText +"']";
	System.out.println("Phone Prefix xpath: " + sXpath);
	WebElement elePhonePrefix = Adriver.findElement(By.xpath(sXpath));
	elePhonePrefix.click();
//	UtilityCustomFunctions.doClick(Adriver, elePhonePrefix);
	
	}
	public void setArrayTextBoxValue(int iObjIndex,String sTxtValue) {
		String sXpath="(//span[@class='select2-selection__rendered' and @role='textbox'])[" + iObjIndex + "]";
		WebElement eleTxtBox = Adriver.findElement(By.xpath(sXpath));
		UtilityCustomFunctions.sendKeysNoEnter(Adriver,eleTxtBox,sTxtValue);
	}
	public void setInputValue(String sModuleName,String sText,String sValue) throws Exception {
		String sXpath = "//input[@type ='text' and @name='" + sModuleName.toLowerCase()+"_"+sText+"']";
		WebElement eleTextBox = Adriver.findElement(By.xpath(sXpath));
		UtilityCustomFunctions.sendKeysNoEnter(Adriver,eleTextBox,sValue);
	}
	public void setInputNumber(String sModuleName,String sText,String sValue) throws Exception {
		String sXpath = "//input[@type ='number' and @name='" + sModuleName.toLowerCase()+"_"+sText+"']";
		WebElement eleTextBox = Adriver.findElement(By.xpath(sXpath));
		UtilityCustomFunctions.sendKeysNoEnter(Adriver,eleTextBox,sValue);
	}
	public void setGenericInputValue(String sType,String sModuleName,String sText,String sValue) throws Exception {
		String sXpath = "//input[@type ='"+ sType + "' and @name='" + sModuleName.toLowerCase()+"_"+sText+"']";
		WebElement eleTextBox = Adriver.findElement(By.xpath(sXpath));
		eleTextBox.clear();
		UtilityCustomFunctions.sendKeysNoEnter(Adriver,eleTextBox,sValue);
	}
	public void setTextAreaValue(String sModuleName,String sText,String sValue) {
		String sXpath="//textarea[@name='"+sModuleName.toLowerCase()+ "_" + sText + "']";
		WebElement eleTextBox = Adriver.findElement(By.xpath(sXpath));
		UtilityCustomFunctions.sendKeysNoEnter(Adriver,eleTextBox,sValue);
	}
	
	public void clickDateBox(String sModuleName,String sText) throws Exception {
		String sXpath = "//input[@type ='text' and @name='" + sModuleName.toLowerCase()+"_"+sText+"']";
		WebElement eleTextBox = Adriver.findElement(By.xpath(sXpath));
		UtilityCustomFunctions.doClick(Adriver, eleTextBox);
	}
	
	public void setEmailValue(String sModuleName,String sText) {
		String sXpath = "//input[@type ='email' and @name='" + sModuleName.toLowerCase()+"_"+"email']";
		WebElement eleTextBox = Adriver.findElement(By.xpath(sXpath));
		UtilityCustomFunctions.sendKeysNoEnter(Adriver,eleTextBox,sText);
	}
	
	public void SetAssignedTo(String sAssignedTo) {
//		UtilityCustomFunctions.selectItemfromListBox(Adriver, eleSelectAssignedTo, sAssignedTo, "span");
		eleSelectAssignedTo.sendKeys(sAssignedTo);
		
	}
	public void SetPhoneNumber(String sPhoneNumber) {
		System.out.println("Phone number to be entered:" + sPhoneNumber);
		UtilityCustomFunctions.sendKeysNoEnter(Adriver, eletxtPhoneNumber, sPhoneNumber);
		System.out.println("Phone number entered:" + sPhoneNumber);
//		eletxtPhoneNumber.sendKeys(sPhoneNumber);
	}
	
	public void SetNumberField(String sNumber) {
		System.out.println("Number field to be entered:" + sNumber);
		UtilityCustomFunctions.sendKeysNoEnter(Adriver, eletxtNumberField, sNumber);
		System.out.println("Number field entered:" + sNumber);
	}
	public void SetEmail(String sEmail) {
		System.out.println("Email to be entered:" + sEmail);
		UtilityCustomFunctions.sendKeysNoEnter(Adriver, eletxtEmail, sEmail);
		System.out.println("Email entered:" + sEmail);
	}
	public void SetEnterYourNumber(String sNumber) {
		System.out.println("Number to be entered:" + sNumber);
		UtilityCustomFunctions.sendKeys(Adriver, txtEnterYourNumber, sNumber);
		System.out.println("Number entered:" + sNumber);
	}
	
	public void setUploadFile() throws Exception {
//		UtilityCustomFunctions.doClick(Adriver, eleUploadFile);
		List<WebElement> lstOldfiles = Adriver.findElements(By.xpath("//i[@class='fa fa-remove']"));
		int iCount = lstOldfiles.size();
		if(iCount>0) {
		for(int i=0;i<iCount;i++) {
			lstOldfiles.get(i).click();
			Thread.sleep(1000);
			}
		}
		Thread.sleep(1000);
		File uploadfile = new File("./src/test/resources/annie-spratt.jpg");
		WebElement fileInput = Adriver.findElement(By.cssSelector("input[type=file]"));
		fileInput.sendKeys(uploadfile.getAbsolutePath());
//		 Adriver.findElement(By.id("file-submit")).click();
	}
	
	//IsMethods
		public boolean isEmailDisplayed() {
			boolean bFlag = false;
			try {
			if(UtilityCustomFunctions.IsElementVisible(Adriver, eletxtEmail)) {
				bFlag = true;
			}
			else {
				bFlag = false;
			}
			}catch(Exception e) {
				bFlag = false;
			}
			return bFlag;
		}
		
	public void displayComboBoxItems() {
		List<WebElement> list = txtMnuList.findElements(By.tagName("span"));
		System.out.println("List Item:" + list.size());
		for(WebElement item : list) {
			System.out.println(item);
		}
	}
			
	public void selDropdownMS(WebDriver webAdriver, List<WebElement> lstMsControl, WebElement eleMultiSelect,String sMS_Value) {
		List<WebElement> listMSControl = (List<WebElement>) lstMsControl;
		System.out.println("MultiSelect size: "+listMSControl.size());
		eleMultiSelect.click();
		
		try {
			((JavascriptExecutor) webAdriver).executeScript("arguments[0].scrollIntoView(true);", lstMsControl);
			
			
			
			System.out.println("Expected values:" + sMS_Value);
			String arrValues[]=sMS_Value.split(",");
			Thread.sleep(1000);
			;
			Thread.sleep(1000);
			for(int i=0;i<arrValues.length;i++) {
				for (WebElement option : listMSControl) {
					System.out.println("Option is: " + option.getText());
					if (arrValues[i].equalsIgnoreCase(option.getText().trim())) {
						option.click();
					}
				}
			}
			eleMultiSelect.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e.getCause());
			Assert.fail("MultiSelection Failed");
		}
		
	}//function end
	
	
	
	
	
	
}
