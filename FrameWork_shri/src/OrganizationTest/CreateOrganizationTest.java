package OrganizationTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import BasePackage.BaseClass;
import pomClasses.Create_Organizations;
import pomClasses.Home_Page;
import pomClasses.Organization_Info;
import pomClasses.Organizations_Page;

public class CreateOrganizationTest extends BaseClass
{
	@Test(groups= {"regressionTest"})
	public void TestStart() throws Throwable
	{
		Home_Page h1 = new Home_Page(driver);

		Organizations_Page o1 = h1.navigateTOrgPage();

		Create_Organizations c1 = o1.navigateToCreateOrg();

		Organization_Info oi = c1.naviToOrgInfo();

		Assert.assertEquals(oi.orgnameText().getText(), c1.Orgname);
	}
}
