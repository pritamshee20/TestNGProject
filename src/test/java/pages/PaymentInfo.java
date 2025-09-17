package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentInfo {
	public WebDriver driver;
	By paymentinfobutton=By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
	public PaymentInfo(WebDriver driver) {
		this.driver=driver;
	}
	public void getpaymentinfo() {
		driver.findElement(paymentinfobutton).click();
	}

}
