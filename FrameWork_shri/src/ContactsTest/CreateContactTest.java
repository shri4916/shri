package ContactsTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.ContactsPage;
import pomClasses.CreateContactPage;
import pomClasses.Home_Page;

public class CreateContactTest extends BaseClass
{
	public Genericlib lib = new Genericlib();
	@Test(groups= {"regressionTest"})
	public void testStart() throws Throwable
	{
		Home_Page hp = new Home_Page(driver);
		hp.getContactLink().click();
		ContactsPage cp = new ContactsPage(driver);
		cp.getAddBtn().click();
		CreateContactPage ccp = new CreateContactPage(driver);
	
		ccp.getLastname().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 4, 0)+lib.genRandomvalue());
		Thread.sleep(3000);
		ccp.getMobile().sendKeys(lib.getExcelDataFixSHEET("sheet1",1, 2));
		ccp.getEmail().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 1));

		ccp.getSaveBtn().click();
	}


}
