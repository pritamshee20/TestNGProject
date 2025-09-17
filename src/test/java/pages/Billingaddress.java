package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Billingaddress {
	public WebDriver driver;
	
	By billaddcontinuebutton=By.xpath("//button[contains(text(),'Continue')]");
	public Billingaddress(WebDriver driver) {
		this.driver=driver;
	}
	
	public void billingaddresscontinue() {
		driver.findElement(billaddcontinuebutton).click();
	}

	

}
