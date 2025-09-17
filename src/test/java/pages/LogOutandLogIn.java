package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutandLogIn {
	public WebDriver driver;
	
	//locators
	By logouttext=By.xpath("//a[contains(text(),'Log out')]");
	By logintext=By.xpath("//a[contains(text(),'Log in')]");
	By email=By.id("Email");
	By password=By.id("Password");
	By logInbutton=By.xpath("//button[contains(text(),'Log in')]");
	
	//constructor
	public LogOutandLogIn(WebDriver driver) {
		this.driver=driver;
	}
	
	//action
	public void loginfillup(String emailid,String pwd) {
		driver.findElement(logouttext).click();
		driver.findElement(logintext).click();
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(logInbutton).click();
	}

}
