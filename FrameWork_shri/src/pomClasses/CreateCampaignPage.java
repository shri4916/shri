package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Genericlib;

public class CreateCampaignPage 
{
	public WebDriver driver;
	public Genericlib lib = new Genericlib();
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement orgNameBox;

	public WebElement getOrgNameBox() {
		return orgNameBox;
	}
	@FindBy(id="targetaudience")
	private WebElement targetBox;
	
	public WebElement getTargetBox() {
		return targetBox;
	}
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement addProduct;

	@FindBy(xpath="/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]"
			+ "/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")
	private WebElement saveProduct;

	public WebElement getAddProduct() {
		return addProduct;
	}


	public WebElement getSaveProduct() {
		return saveProduct;
	}


	public CreateCampaignPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public CreateChildCamp navigateToCreateCamp() throws Throwable
	{
		getOrgNameBox().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 2, 0)+lib.genRandomvalue());
		getAddProduct().click();
		CreateChildCamp ccp = new CreateChildCamp(driver);
		lib.switchChild(driver);
		ccp.actonChildCamp();
		lib.switchParent(driver);
		getSaveProduct().click();
		Thread.sleep(3000);
		return new CreateChildCamp(driver);
	}
}
