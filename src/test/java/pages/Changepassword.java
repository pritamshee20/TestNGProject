package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Changepassword {
	public WebDriver driver;
	
	//locators
	By myaccount=By.xpath("//a[@class='ico-account']");
	By changepasswordsection=By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li[7]/a");
	By oldpassword=By.id("OldPassword");
	By newpassword=By.id("NewPassword");
	By confirmpassword=By.id("ConfirmNewPassword");
	By changepasswordbutton=By.xpath("//button[contains(text(),'Change password')]");
	
	public Changepassword(WebDriver driver) {
		this.driver=driver;
	}
	
	//actions
	public void passwordfillup(String pwd,String newpwd,String cnewpwd) {
		driver.findElement(myaccount).click();
		driver.findElement(changepasswordsection).click();
		driver.findElement(oldpassword).sendKeys(pwd);
		driver.findElement(newpassword).sendKeys(newpwd);
		driver.findElement(confirmpassword).sendKeys(cnewpwd);
		driver.findElement(changepasswordbutton).click();
		
	}

}
