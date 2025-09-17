package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProducts {
	public WebDriver driver;
	
	//locators
	By searchbox=By.id("small-searchterms");
	By searchbutton=By.xpath("//button[contains(text(),'Search')]");
	By addTocart=By.xpath("//button[contains(text(),'Add to cart')]");
	By producttitle=By.partialLinkText("Apple MacBook Pro");
	By producttitle2=By.partialLinkText("Samsung Galaxy S24 256GB");
	
	//constructor
	public SearchProducts(WebDriver driver) {
		this.driver=driver;
	}
	
	//actions
	public void productSearch(String product1,String product2) {
		driver.findElement(searchbox).sendKeys(product1);
		driver.findElement(searchbutton).click();
		driver.findElement(producttitle).click();
		driver.findElement(addTocart).click();
		driver.findElement(searchbox).sendKeys(product2);
		driver.findElement(searchbutton).click();
		driver.findElement(producttitle2).click();
		driver.findElement(addTocart).click();
	}

}
