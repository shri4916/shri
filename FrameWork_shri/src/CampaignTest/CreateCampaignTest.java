package CampaignTest;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.CampaignPage;
import pomClasses.CreateCampaignPage;
import pomClasses.CreateChildCamp;
import pomClasses.Home_Page;

public class CreateCampaignTest extends BaseClass
{
	Genericlib lib = new Genericlib();
	@Test(groups= {"regressionTest"})
	public void TestStart() throws Throwable
	{
		Home_Page hp = new Home_Page(driver);

		CampaignPage c = hp.navigateTMoreCampaign();
		
		CreateCampaignPage cp = c.navigateToCreateCAMP();
		cp.navigateToCreateCamp();
	
	}
}
