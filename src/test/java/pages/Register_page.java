package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_page {
	WebDriver driver;
	
	//locators for registation
	By registertext=By.xpath("//a[contains(text(),'Register')]");
	By genderbutton=By.id("gender-male");
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By email=By.id("Email");
	By companyname=By.id("Company");
	By password=By.id("Password");
	By confirmpassword=By.id("ConfirmPassword");
	By registerbutton=By.id("register-button");
	By continuebutton=By.xpath("//a[@class='button-1 register-continue-button']");
	
	//constructor
	public Register_page(WebDriver driver) {
		this.driver=driver;
	}
	
	//action
	public void register(String fname,String lname,String emailid,String company,String pwd,String cpwd) {
		driver.findElement(registertext).click();
		driver.findElement(genderbutton).click();
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(companyname).sendKeys(company);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmpassword).sendKeys(cpwd);
		driver.findElement(registerbutton).click();
		driver.findElement(continuebutton).click();
	}

}
