package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Genericlib;

public class CreateChildCamp 
{
	public Genericlib lib;
	public WebDriver driver;
	@FindBy(id="search_txt")
	private WebElement childSearch;

	@FindBy(xpath="//input[@type='button']")
	private WebElement searchBtn;


	@FindBy(id="1")
	private WebElement searchResult;


	public WebElement getChildSearch() {
		return childSearch;
	}


	public WebElement getSearchBtn() {
		return searchBtn;	
	}


	public WebElement getSearchResult() {
		return searchResult;
	}

	public CreateChildCamp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void actonChildCamp() throws InterruptedException
	{
		Thread.sleep(2000);
		getChildSearch().sendKeys("santoor");
		getSearchBtn().click();
		Thread.sleep(2000);
		getSearchResult().click();
		
	}
}
