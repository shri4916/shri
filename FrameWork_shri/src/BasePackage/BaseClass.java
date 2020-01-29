
package BasePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import GenericLib.Genericlib;
import pomClasses.Home_Page;
import pomClasses.Vtiger_Commercial_Open;

public class BaseClass 
{
	public Genericlib lib;
	public WebDriver driver;
	
	@BeforeClass(groups= {"smokeTest"})
	public void openBrowser()
	{
		lib = new Genericlib();
		lib.chromeDriver();
		driver= new ChromeDriver();
		System.out.println("=========LAUNCH BROWSER===========");
	}

	
	@BeforeMethod
	public void configBM() throws Throwable
	{
		lib = new Genericlib();
		String url = lib.getvaluesfromProp("url");
		String Uname=lib.getvaluesfromProp("username");
		String Pass=lib.getvaluesfromProp("password");
		driver.get(url);
		Vtiger_Commercial_Open v1 = new Vtiger_Commercial_Open(driver);
		v1.login(Uname, Pass);
		System.out.println("=========LOGIN===========");
	}
	

	@AfterMethod
	public void configAM() throws Throwable
	{
		Home_Page hp= new Home_Page(driver);
		hp.logOut();
		System.out.println("========LOGOUT============");
	}
	
	@AfterClass
	public void configAC()
	{
		driver.close();
		System.out.println("==========CLOSE BROWSER===========");
	}

}
