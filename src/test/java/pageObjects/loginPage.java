package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebDriver_Manager.DriverManager;

public class loginPage extends DriverManager{
	
	private  WebDriver driver;
	public String actualText;
	public loginPage(WebDriver driver) throws Exception {
		driver = DriverManager.driver;
		if (DriverManager.driver == null) {
		    throw new Exception("WebDriver is null");
		}
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//div[normalize-space()='SIGN IN']")
	private WebElement signin;
	
	@FindBy(xpath="//*[@data-tag='Sign In']")
	private WebElement signin_1;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Sign In & Continue']")
	private WebElement signInButton;
	
	@FindBy(xpath="//div[normalize-space()='ACCOUNT']")
	private WebElement account;
	
	
	public void siginLink() {
		signin.click();
		signin_1.click();
	}
	public void login(String uName, String pwd) {
		userName.sendKeys(uName);
		password.sendKeys(pwd);
	}
	
	public void signInB() {
		signInButton.click();
	}
	
	public String loggedIn() {
		 actualText = account.getText();
		return actualText;
	}

	
}
