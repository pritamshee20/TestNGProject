package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shipping {
	public WebDriver driver;
	
	By shippingcontinuebutton=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
	
	public Shipping(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getshipping() {
		driver.findElement(shippingcontinuebutton).click();
	}

}
