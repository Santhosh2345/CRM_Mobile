package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import utilities.UtilityCustomFunctions;
public class DetailViewPage extends BasePage{

	public DetailViewPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath="(//div[starts-with(@id,'accordion')]/a)[2]")
	WebElement tabBlockB;
	
	@FindBy(xpath="(//div[starts-with(@id,'accordion')]/a)[3]")
	WebElement tabBlockC;
	
	@FindBy(xpath="//label[@for='cb4']")
	WebElement tglSummary;
	
	@FindBy(xpath="//label[@for='title_toggle']")
	WebElement tglHeaders;
	
	@FindBy(xpath="//input[@id='cb4']")
	WebElement tglChkSummary;
	
	@FindBy(xpath="//input[@id='title_toggle']")
	WebElement tglChkHeaders;
	
	@FindBy(xpath="//*[@id='createtime_CT']")
	WebElement lblCurrentTime;
	
	@FindBy(xpath="//span[@class='label_name']")
	WebElement tglSummaryLabel;
	
	@FindBy(xpath="//h3[@class='card-title']")
	WebElement tglHeaderLabel;
	
	@FindBy(xpath="//button[normalize-space()='add']")
	WebElement btnAddRecord;
	
	@FindBy(xpath="//button[text()='edit_square']")
	WebElement btnEditRecord;
	
	@FindBy(xpath="//button[normalize-space()='content_copy']")
	WebElement btnDuplicate;
	
	
	@FindBy(xpath="//div[@class='col-lg-9']/label")
	WebElement lblSummaryAssignedTo;
	
	@FindBy(xpath="(//div[@class='col-md-12']//b)[1]")
	WebElement lblPhoneNumberTitle;
	
	@FindBy(xpath="(//div[@class='col-md-12']//b)[2]")
	WebElement lblEmailTitle;
	
	@FindBy(xpath="(//div[@class='col-md-12']//b)[3]")
	WebElement lblMenuItemTitle;
	
	@FindBy(linkText="Summary")
	WebElement tabSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[1]")
	WebElement lblPhoneNumberSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[2]")
	WebElement lblNumberFieldSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[3]")
	WebElement lblEmailSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[4]")
	WebElement lblMenuItemSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[5]")
	WebElement lblEnterYourNMSummary;
	
	@FindBy(xpath="//a[normalize-space()='Details']")
	WebElement lnkDetailView;
	
	@FindBy(xpath="//a[@class='header_dup_all_module_show_btn']")
	WebElement lnkNavBarModuleName;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[1]")
	WebElement lblAssignedToDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[2]")
	WebElement lblPhoneNumberDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[3]")
	WebElement lblNumberFieldDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[4]")
	WebElement lblEmailDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[5]")
	WebElement lblMenuItemDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[6]")
	WebElement lblEYPNDetailView;
	
	@FindBy(xpath="//span[contains(@class,'comment_text')]")
	WebElement lblUploadFile;
	
	@FindBy(xpath="//span[@data-label='Text']//i[contains(@class,'fa fa-check')]")
	WebElement btnTickSave;
	
	@FindBy(xpath="//span[@data-label='Number Field']//i[contains(@class,'fa fa-check')]")
	WebElement btnNumberTickSave;
	
	public String getToggleViewText() {
		try {
		return tglSummaryLabel.getText();
		}catch(Exception e) {
			return "Detail view";
		}
	}
	public String getToggleHeaderText() {
		return tglHeaders.getText();
	}
	public String getCurrentTime() throws Exception {
		return UtilityCustomFunctions.getText(Adriver, lblCurrentTime);
	}
	//click Methods
	public void fSetToggleHeader(boolean bFlag) {
		if(bFlag==true) {
		if(tglChkHeaders.isSelected()==false) {
			tglHeaders.click();
		}
		}
		else {
			if(tglChkHeaders.isSelected()==true) {
				tglHeaders.click();
			}
		}
	}
	public void fSetDetailVew(boolean bFlag) {
		if(bFlag==true) {
		if(tglChkSummary.isSelected()==false) {
			tglSummary.click(); }
		}
		else {
			if(tglChkSummary.isSelected()==true) {
				tglSummary.click();
			}
		}
	}
	public void fClickDetailBlockB() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, tabBlockB);
	}
	public void fClickDetailBlockC() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, tabBlockC);
	}
	public void fdefaultToggleStatus() {
		System.out.println("Toggle Summary default: "+tglChkSummary.isSelected());
		System.out.println("Toggle Headers default: "+ tglChkHeaders.isSelected());
	}
	public void clickSummaryView() throws InterruptedException{
		Thread.sleep(3000);
//		System.out.println("Toggle View: Before Click:" + getToggleViewText());
//		tglSummary.click();
		
//		Thread.sleep(3000);
//		System.out.println("Toggle View: After click:" + getToggleViewText());
		
		Thread.sleep(3000);
		System.out.println("Toggle Header: Before click:" + getToggleHeaderText());
		tglHeaders.click();
		Thread.sleep(3000);
		System.out.println("Toggle Header: After click:" + getToggleHeaderText());
		Thread.sleep(3000);
		
//		System.out.println(tglSummary.getAttribute("checked"));
//		String tglAttribute = tglSummary.getAttribute("innerHTML");
//		System.out.println(tglAttribute);
//		System.out.println(tglSummary.getAttribute("innerText"));
//		System.out.println(tglSummary.getAttribute("value"));
//		System.out.println(tglSummary.getAttribute("class"));
//		tglSummary.click();
//		Thread.sleep(3000);
//		System.out.println("Toggle Text:" + getToggleViewText());
//		tglAttribute = tglSummary.getAttribute("innerHTML");
//		System.out.println(tglAttribute);
//		System.out.println(tglSummary.getAttribute("innerText"));
//		System.out.println(tglSummary.getAttribute("value"));
//		System.out.println(tglSummary.getAttribute("class"));
//		System.out.println(tglSummary.getAttribute("checked"));
//		
	}
	
	public void clickEditRecordItem() throws InterruptedException {
		Actions action = new Actions(Adriver);
		String sXpath1 = "(//div[@class='col-lg-10'])[1]";
		WebElement eleArrSummary = Adriver.findElement(By.xpath(sXpath1));
		Thread.sleep(2000);
		action.moveToElement(eleArrSummary).perform();
		String sXpath="//table[contains(@class,'table table-bordered')]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/i[1]";
		
		WebElement eleRecEdit = Adriver.findElement(By.xpath(sXpath));
		eleRecEdit.click();
	}
	public void clickEdtSngFldMod() throws InterruptedException {
		Actions action = new Actions(Adriver);
		String sXpath1 = "(//div[@class='col-lg-10'])[2]";
		WebElement eleArrSummary = Adriver.findElement(By.xpath(sXpath1));
		Thread.sleep(2000);
		action.moveToElement(eleArrSummary).perform();
		String sXpath="//i[@class='fa fa-edit 5815_icon']";
		WebElement eleRecEdit = Adriver.findElement(By.xpath(sXpath));
		eleRecEdit.click();
	}
	public void clickRecItemSave() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, btnTickSave);
	}
	
	public void clickNMRecItemSave() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, btnNumberTickSave);
	}
	
	
	
	
//	public void clickSummaryView() throws Exception {
//		UtilityCustomFunctions.doClick(Adriver, tabSummary);
//	}
	public void clickAddRecord() throws Exception {
		UtilityCustomFunctions.doActionClick(Adriver, btnAddRecord);
	}
	public void clickEditRecord() throws Exception {
		UtilityCustomFunctions.doActionClick(Adriver, btnEditRecord);
	}
	public void clickDuplicateRecord() throws Exception {
		UtilityCustomFunctions.doActionClick(Adriver, btnDuplicate);
	}
	
	//Get Methods.
	
	public String getGenericTitle(int ititlePos) throws Exception {
		String sXpath="(//div[@class='col-md-12']//b)[" + ititlePos + "]";
		WebElement eleTitle = Adriver.findElement(By.xpath(sXpath));
		return UtilityCustomFunctions.getText(Adriver, eleTitle);
				
	}
	public String getUploadFileText() throws Exception
	{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblUploadFile);
		return sActValue;
	}
	public String getPhoneNMTitle() throws Exception {
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblPhoneNumberTitle);
		return sActValue;
	}
	public String getEmailTitle() throws Exception {
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblEmailTitle);
		return sActValue;
	}
	public String getMenuItemTitle() throws Exception {
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblMenuItemTitle);
		return sActValue;
	}
	
	public String getNavBarModuleName() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lnkNavBarModuleName);
		return sActValue;
	}
	
	//Get Summary Details
	public String getArraySummary(int ielePos) throws Exception {
		String sXpath = "(//div[@class='col-lg-10'])["+ ielePos+ "]";
		WebElement eleArrSummary = Adriver.findElement(By.xpath(sXpath));
		return UtilityCustomFunctions.getText(Adriver, eleArrSummary); 
	}
	public String getSummaryUrl() throws Exception {
		String sXpath = "(//div[@class='col-lg-10'])[17]//a";
//		String sXpath = "//a[normalize-space()='Click Here']";
		WebElement eleArrSummary = Adriver.findElement(By.xpath(sXpath));
		return  eleArrSummary.getAttribute("href");
	}
	public String getDTSummaryUrl() throws Exception {
		String sXpath = "(//div[@class='col-lg-10'])[19]//a";
//		String sXpath = "//a[normalize-space()='Click Here']";
		WebElement eleArrSummary = Adriver.findElement(By.xpath(sXpath));
		return  eleArrSummary.getAttribute("href");
	}
	
	public String getDetailUrl() throws Exception {
		String sXpath = "(//td[starts-with(@id, 'hide')])[19]";
		WebElement eleArrDetail= Adriver.findElement(By.xpath(sXpath));
		return  eleArrDetail.getAttribute("href");
	}
	
	public String getSummaryAssignTo() throws Exception {
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblSummaryAssignedTo);
		return sActValue;
	}
	public String getArrayDetails(int ielePos) throws Exception {
		String sXpath = "(//td[starts-with(@id, 'hide')])["+ ielePos+ "]";
		WebElement eleArrDetais= Adriver.findElement(By.xpath(sXpath));
		return UtilityCustomFunctions.getText(Adriver, eleArrDetais); 
	}
			
	
	public String getPhoneNMSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblPhoneNumberSummary);
		return sActValue;
	}
	public String getNumberFieldSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblNumberFieldSummary);
		return sActValue;
	}
	public String getEmailSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblEmailSummary);
		return sActValue;
	}
	public String getMenuItemSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblMenuItemSummary);
		return sActValue;
	}
	public String getEYNumberSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblEnterYourNMSummary);
		return sActValue;
	}
	
	
	//Detail View 
	public String getAssignedToDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblAssignedToDetailView);
		return sActValue;
	}
	public String getPhoneNMDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblPhoneNumberDetailView);
		return sActValue;
	}
	public String getNumberFieldDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblNumberFieldDetailView);
		return sActValue;
	}
	public String getEmailDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblEmailDetailView);
		return sActValue;
	}
	public String getMenuListDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblMenuItemDetailView);
		return sActValue;
	}
	public String getEYVDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(Adriver, lblEYPNDetailView);
		return sActValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
