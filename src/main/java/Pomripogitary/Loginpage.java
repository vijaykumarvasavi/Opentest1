package Pomripogitary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	public Loginpage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//li[@id='Isolation Ward']")
	private WebElement wordBt;
		
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getWordBt() {
		return wordBt;
	}

	public WebElement getLoginBt() {
		return loginBt;
	}


	public WebElement getLogoutBt() {
		return logoutBt;
	}


	@FindBy(xpath="//input[@id='loginButton']")
	private WebElement loginBt;
	
	@FindBy(xpath="//li[@class='nav-item logout']")
	private WebElement logoutBt;
	
	
	
	
	
	
	
	
	
	
	
	

}
