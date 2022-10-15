package Pomripogitary;

import javax.print.event.PrintJobAttributeEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	
	public Register(WebDriver driver) 
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


	


	@FindBy(xpath="//input[@id='loginButton']")
	private WebElement loginBt;
	

	
	@FindBy(xpath="//a[contains(@id,'referenceapplication-registrati')]")
	private WebElement registerBt;
	
	@FindBy(xpath="//input[@name='givenName']")
	private WebElement givenname;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middlename;
	
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement fimailname;
	
	public WebElement getFimailname() {
		return fimailname;
	}


	@FindBy(xpath="//button[@id='next-button']")
	private WebElement nextBt1;
	
	@FindBy(xpath="//select[@id='gender-field']")
	private WebElement selectMail;
	
	@FindBy(xpath="//option[@value='M']")
	private WebElement Male;
	
	@FindBy(xpath="//input[@id='birthdateDay-field']")
	private WebElement Day;
	
	@FindBy(xpath="//select[@id='birthdateMonth-field']")
    private WebElement month;
	
	@FindBy(xpath="//input[@id='birthdateYear-field']")
	private WebElement year;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next2;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@id='stateProvince']")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='postalCode']")
	private WebElement pincodee;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next3;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement phonenum;
	
	public WebElement getRegisterBt() {
		return registerBt;
	}

	public WebElement getGivenname() {
		return givenname;
	}
 
	public WebElement getMiddlename() {
		return middlename;
	}

	public WebElement getNextBt1() {
		return nextBt1;
	}

	public WebElement getSelectMail() {
		return selectMail;
	}

	public WebElement getMale() {
		return Male;
	}

	public WebElement getDay() {
		return Day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getNext2() {
		return next2;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPincodee() {
		return pincodee;
	}

	public WebElement getNext3() {
		return next3;
	}

	public WebElement getPhonenum() {
		return phonenum;
	}

	public WebElement getNext4() {
		return next4;
	}

	public WebElement getReletions() {
		return reletions;
	}

	public WebElement getReletionsname() {
		return reletionsname;
	}

	public WebElement getNext5() {
		return next5;
	}

	public WebElement getSubmitted() {
		return submitted;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next4;
	
	@FindBy(xpath="//select[@id='relationship_type']")
	private WebElement reletions;
	
	@FindBy(xpath="person-typeahead ng-pristine ng-valid ng-empty ng-touched")
	private WebElement reletionsname;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next5;
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement submitted;
	
	@FindBy(xpath="//li[@class='nav-item logout']")
	private WebElement logout;
	
	
	
	
	public WebElement getHome() {
		return home;
	}

	public WebElement getFind() {
		return find;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getRugina() {
		return rugina;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getReson() {
		return reson;
	}

	public WebElement getConfirm() {
		return confirm;
	}


	@FindBy(xpath="//i[@class='icon-home small']")
	private WebElement home;
	
	@FindBy(xpath="//a[contains(@id,'coreapps-activeVisitsHomepageLink-coreapps-')]")
	private WebElement find;
	
	@FindBy(xpath="//form[@id='patient-search-form']")
	private WebElement searchbar;
	
	@FindBy(xpath="//td[text()='RUGINA Gervais']")
	private WebElement rugina;
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[19]")
	private WebElement delete;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	private WebElement reson;
	
	@FindBy(xpath="(//button[@class='confirm right'])[6]")
	private WebElement confirm;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
