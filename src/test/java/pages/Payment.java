package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {
	public WebDriver driver;
	
	By paymentcontinuebutton=By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
	
	public Payment(WebDriver driver) {
		this.driver=driver;
		
	}
	public void getpayment() {
		driver.findElement(paymentcontinuebutton).click();
	}

}
