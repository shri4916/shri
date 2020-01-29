package OrganizationTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.Create_Organizations;
import pomClasses.Home_Page;
import pomClasses.Organization_Info;
import pomClasses.Organizations_Page;
import pomClasses.Organizations_childWindow;
import pomClasses.Vtiger_Commercial_Open;

public class CreateOrganizationTestNormal extends BaseClass
{
	@Test
	public void TestStart() throws Throwable
	{
		GenericLib.Genericlib lib = new Genericlib();
		Home_Page h1 = new Home_Page(driver);
		h1.getorgLink().click();
		
		Organizations_Page o1 = new Organizations_Page(driver);
		o1.getAddbutton().click();

		Create_Organizations c1 = new Create_Organizations(driver);
		String orgName=lib.getExcelDataFixSHEET("Sheet1",5,0)+lib.genRandomvalue();
		c1.getOrgnamebox().sendKeys(orgName);
		c1.getEmailid().sendKeys(lib.getExcelDataFixSHEET("Sheet1",3,1));
		c1.getPhoneno().sendKeys(lib.getExcelDataFixSHEET("Sheet1",3,2));
		
		//c1.getAddimage().click();
		//switch to child
		//lib.switchChild(driver);
/*
		Organizations_childWindow ow1 = new Organizations_childWindow(driver);
		ow1.getOrgChildSearch().sendKeys(lib.getExcelDataFixSHEET("Sheet1",1,3));
		ow1.getOrgChildbutton().click();
		ow1.getSearchResult().click();
		driver.switchTo().alert().accept();
		//switch to parent
		lib.switchParent(driver);
*/		
		c1.getSave().click();
		
		Organization_Info oi = new Organization_Info(driver);
		Thread.sleep(3000);
		String actual_name =oi.orgnameText().getText();
		Assert.assertEquals(actual_name, orgName);
		System.out.println("Data Inserted");
	//	h1.logOut();
	}
}
