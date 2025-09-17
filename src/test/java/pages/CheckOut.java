package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
	public WebDriver driver;
	
	By checkboxfill=By.xpath("//input[@id='termsofservice']");
	By checkoutbutton=By.id("checkout");
	
	public CheckOut(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getcheckout() {
		driver.findElement(checkboxfill).click();
		driver.findElement(checkoutbutton).click();
	}

}
