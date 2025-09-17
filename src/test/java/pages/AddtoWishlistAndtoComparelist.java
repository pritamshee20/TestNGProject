package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoWishlistAndtoComparelist {
	public WebDriver driver;
	
	//locators
	By searchbox=By.id("small-searchterms");
	By searchbutton=By.xpath("//button[contains(text(),'Search')]");
	By producttitle3=By.partialLinkText("Leica T Mirrorless Digital Camera");
	By addtowishlist=By.xpath("//button[contains(text(),'Add to wishlist')]");
	By producttiltle4=By.partialLinkText("HTC One Mini Blue");
	By addtocomparelist=By.xpath("//button[contains(text(),'Add to compare list')]");

	//constructor
	public AddtoWishlistAndtoComparelist(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addproduct(String product3,String product4) {
		driver.findElement(searchbox).sendKeys(product3);
		driver.findElement(searchbutton).click();
		driver.findElement(producttitle3).click();
		driver.findElement(addtowishlist).click();
		driver.findElement(searchbox).sendKeys(product4);
		driver.findElement(searchbutton).click();
		driver.findElement(producttitle3).click();
		driver.findElement(addtocomparelist).click();
		
		
		
	}

}
