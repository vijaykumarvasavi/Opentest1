import java.util.List;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Library.Basedetails;
import Library.Excelsheet;
import Library.Notepad;
import Pomripogitary.Loginpage;
import Pomripogitary.Register;

public class Registeruserdetails extends Basedetails{
	
	
	
	
	
	@Test(priority = 1)
	public void Testdata( ) throws Exception 
	{
	
		Notepad no = new Notepad();
		Loginpage lo = new Loginpage(driver);
		
	   String USERNAME = no.getdatafilepath("username");
	   System.out.println(USERNAME);
	   
	   String PASSWORD = no.getdatafilepath("password");
	   System.out.println(PASSWORD);
	   
	   lo.getUsername().sendKeys(USERNAME);
	   Thread.sleep(3000);
	   
	   lo.getPassword().sendKeys(PASSWORD);
	   Thread.sleep(3000);
	   
	   lo.getWordBt().click();
	   Thread.sleep(4000);
	   
	   lo.getLoginBt().click();
	   Thread.sleep(4000);
	   
	   lo.getLogoutBt().click();
	   Thread.sleep(4000);		
		
	}
	
	
	@Test(priority = 2)
	public void registeruser() throws Exception {
		
		Excelsheet ex = new Excelsheet();
		Notepad no = new Notepad();
		Register re = new Register(driver);
		
		
		String USERNAME = no.getdatafilepath("username");
		String PASSWORD = no.getdatafilepath("password");
		
		String GIVENNAME = ex.getexcelsheetdata("Sheet1", 1, 0);
		String MIDDLENAME = ex.getexcelsheetdata("Sheet1", 1, 1);
		String FIMALYNAME = ex.getexcelsheetdata("Sheet1", 1, 2);
		
		
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(GIVENNAME);
		System.out.println(MIDDLENAME);
		System.out.println(FIMALYNAME);
		
		re.getUsername().sendKeys(USERNAME);
		Thread.sleep(3000);
		
		re.getPassword().sendKeys(PASSWORD);
		Thread.sleep(3000);
		
		re.getWordBt().click();
		Thread.sleep(3000);
		
		re.getLoginBt().click();
		Thread.sleep(3000);
		
		re.getRegisterBt().click();
		Thread.sleep(3000);
		
		re.getGivenname().sendKeys(GIVENNAME);
		Thread.sleep(3000);
		
		re.getMiddlename().sendKeys(MIDDLENAME);
		Thread.sleep(3000);		
			
		re.getFimailname().sendKeys(FIMALYNAME);
		Thread.sleep(3000);
		
		re.getNextBt1();
		Thread.sleep(3000);
		
		
        List<WebElement>links= driver.findElements(By.xpath("//option[@value='M']")); 
		System.out.println("Names"+ links.size());
		
		for(WebElement link:links)
		{
			if(link.getText().equals("male")) 
			{
				link.click();
				break;
			}
		}
		
		re.getNext2().click();
		Thread.sleep(3000);
		
		String DAY = no.getdatafilepath("day");
		System.out.println(DAY);		
		re.getDay().sendKeys(DAY);
		Thread.sleep(3000);
		
		WebElement MONTH = re.getMonth();
		Select se = new Select(MONTH);		
		se.selectByIndex(4);
		Thread.sleep(3000);
		
		String YEAR = no.getdatafilepath("year");
		System.out.println(YEAR);
		re.getMonth().sendKeys(YEAR);
		Thread.sleep(3000);
		
		re.getNext3();
		Thread.sleep(4000);
		
		re.getNext3().click();
		Thread.sleep(3000);
		
		String ADDRESS = ex.getexcelsheetdata("Sheet1", 1, 3);
		String ADDRESS1 = ex.getexcelsheetdata("Sheet1", 1, 4);
		String STATE = ex.getexcelsheetdata("Sheet1", 1, 5);
		String COUNTRY = ex.getexcelsheetdata("Sheet1", 1, 6);
		
		System.out.println(ADDRESS);
		System.out.println(ADDRESS1);
		System.out.println(STATE);
		System.out.println(COUNTRY);
		
		String PINCODE = no.getdatafilepath("pincode");
		System.out.println(PINCODE);
		
		
		re.getAddress1().sendKeys(ADDRESS);
		Thread.sleep(3000);
		
		re.getAddress2().sendKeys(ADDRESS1);
		Thread.sleep(3000);
		
		re.getState().sendKeys(STATE);
		Thread.sleep(3000);
		
		re.getCountry().sendKeys(COUNTRY);
		Thread.sleep(3000);
		
		re.getPincodee().sendKeys(PINCODE);
		Thread.sleep(3000);
		
		re.getNext4();
		Thread.sleep(3000);
		
		String PHONENUM = no.getdatafilepath("phone");
		System.out.println(PHONENUM);
		
		re.getPhonenum().sendKeys(PHONENUM);
		Thread.sleep(3000);
		
		re.getNext5().click();
		Thread.sleep(2000);
		
		WebElement RELESIONS = re.getReletions();
		 Select se1 = new Select(RELESIONS);
		 
		 se1.selectByIndex(2);
		 Thread.sleep(2000);
		 
		 String PERSONNEMAE = ex.getexcelsheetdata("Sheet1", 1, 9);
		 System.out.println(PERSONNEMAE);
		 
		 re.getReletionsname().sendKeys(PERSONNEMAE);
		 Thread.sleep(3000);
		 re.getNext5();
		 Thread.sleep(3000);
		 
		 re.getSubmitted().click();
		 Thread.sleep(3000);
		 
	     }		 
		 
	
	
		 @Test(priority = 3)
		 public void findpertinet() throws InterruptedException {
		 Register re = new Register(driver);
		 
		 re.getHome().click();
		 Thread.sleep(3000);
		 
		 re.getFind().click();
		 Thread.sleep(3000);
		 
		 re.getSearchbar().sendKeys("RUGINA");
		 Thread.sleep(3000);
		 
		 }
		 
		 
		 
		 @Test(priority = 4)
		 public void search() throws InterruptedException {
		 Register re = new Register(driver);	 
		 
		 re.getRugina().click();
		 Thread.sleep(3000);
		 
		 re.getDelete().click();
		 Thread.sleep(3000);
		 
		 String mainid = driver.getWindowHandle();
		 Set<String> WINDOW = driver.getWindowHandles();
		  
		 driver.switchTo().window(mainid);
		 
		 re.getReson().sendKeys("done");
		 Thread.sleep(3000);
		 
		 re.getConfirm().click();
		 Thread.sleep(3000);
		 
		 re.getLogout().click();
		 Thread.sleep(3000);			 
			 
		 }
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
