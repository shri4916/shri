package OrganizationTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.CampaignPage;
import pomClasses.Create_Organizations;
import pomClasses.Home_Page;
import pomClasses.Organizations_Page;

public class TestOrganization1  extends BaseClass
{
	public Genericlib lib= new Genericlib();
	@Test(groups= {"smokeTest"})
	public void OrganizationTest1() throws Throwable
	{
		Home_Page hp = new Home_Page(driver);
		hp.getorgLink().click();
		Organizations_Page op = new Organizations_Page(driver);
		op.getAddbutton().click();
		Create_Organizations co = new Create_Organizations(driver);
		co.getOrgnamebox().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 1)+lib.genRandomvalue()+lib.genRandomvalue());
		Thread.sleep(3000);
		co.getSave().click();
		Thread.sleep(3000);
	}
}
