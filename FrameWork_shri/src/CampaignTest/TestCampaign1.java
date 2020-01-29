package CampaignTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.CampaignPage;
import pomClasses.CreateCampaignPage;
import pomClasses.Home_Page;

public class TestCampaign1 extends BaseClass
{
	public Genericlib lib = new Genericlib();
	@Test(groups= {"smokeTest"})
	public void CampaignTest1() throws Throwable
	{
		Home_Page hp = new Home_Page(driver);
		hp.getMore().click();
		hp.getCamp().click();
		CampaignPage cp = new CampaignPage(driver);
		Thread.sleep(2000);
		cp.getImgaddBtn().click();
		CreateCampaignPage ccp= new CreateCampaignPage(driver);
		Thread.sleep(2000);
		ccp.getOrgNameBox().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 0)+lib.genRandomvalue());
		ccp.getSaveProduct().click();
		
	}
}
