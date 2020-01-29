package OrganizationTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.Create_Organizations;
import pomClasses.Home_Page;
import pomClasses.Organizations_Page;

public class TestOrganization2  extends BaseClass
{

	public Genericlib lib =  new Genericlib();
	@Test
	public void OrganizationTest2() throws Throwable
	{
		Home_Page hp = new Home_Page(driver);
		hp.getorgLink().click();
		Organizations_Page op = new Organizations_Page(driver);
		op.getAddbutton().click();
		Create_Organizations co = new Create_Organizations(driver);
		co.getOrgnamebox().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 1)+lib.genRandomvalue());
		co.getPhoneno().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 2));
		Thread.sleep(3000);
		co.getSave().click();
		Thread.sleep(3000);
	}
}
