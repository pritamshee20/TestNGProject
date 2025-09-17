package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOrder {
	public WebDriver driver;
	
	//locators
	By myaccount2=By.xpath("//a[@class='ico-account']");
	By ordersection=By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li[3]/a");
	
	public CheckOrder(WebDriver driver) {
		this.driver=driver;
	}
	
	public void orderinfo() {
		driver.findElement(myaccount2).click();
		driver.findElement(ordersection).click();
	}

}
