package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class OrderProduct {
    public WebDriver driver;
    

    // locators
    By shoppingcartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
    By gotocartLink=By.xpath("//button[contains(text(),'Go to cart')]");


    public OrderProduct(WebDriver driver) {
        this.driver = driver;
        
    }

    // actions
    public void cart() {
        WebElement shoppingcartmouse=driver.findElement(shoppingcartLink);
        Actions action=new Actions(driver);
        action.moveToElement(shoppingcartmouse).perform();
        driver.findElement(gotocartLink).click();
    }
}
