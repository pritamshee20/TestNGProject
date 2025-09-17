package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirm {
	public WebDriver driver;
	
	By confirmbutton=By.xpath("//button[contains(text(),'Confirm')]");
	public Confirm(WebDriver driver) {
		this.driver=driver;
	}
	public void getconfirm() {
		driver.findElement(confirmbutton).click();
	}

}
