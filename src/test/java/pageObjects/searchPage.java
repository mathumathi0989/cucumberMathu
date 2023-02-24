package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import WebDriver_Manager.DriverManager;



public class searchPage extends DriverManager {
	private  WebDriver driver;

	@FindBy(xpath="//div[@id='model-number-input-container']/following-sibling::button")
	private WebElement searchButton;
	

	@FindBy(id="model-number")
	private WebElement id;
	
	@FindBy(xpath="//*[@class='product-name']/strong")
	private WebElement getMessage;
	
	@FindBy(xpath="//*[@id='search-result-message']/p")
	private WebElement getErrorMessage;
	
	public searchPage(WebDriver driver) throws Exception {
	driver = DriverManager.driver;
	if (DriverManager.driver == null) {
	    throw new Exception("WebDriver is null");
	}
	PageFactory.initElements(driver, this);
	}


	public void searchText(String data) throws Exception {
		id.clear();
		id.sendKeys(data);
	
	}
	
	public void searchButton() throws Exception{
		searchButton.click();
		Thread.sleep(2000);
	}

	public String searchpageValid() throws Exception {
		String title = getMessage.getText();
		System.out.println("Title of the product: " +title);
		String[] split_title = title.split(" ",10);
		System.out.println(split_title[0]);
		return split_title[0];
	}

	public String searchPageInvalid() {
		String woTitle = getErrorMessage.getText();
		System.out.println(woTitle);
		return woTitle;
	}




}
