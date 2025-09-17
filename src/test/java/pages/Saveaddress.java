package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Saveaddress {
	public WebDriver driver;
	
	//loactors
	By myaccount=By.xpath("//a[@class='ico-account']");
	By addressSection=By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li[2]/a");
	By addNewbutton=By.xpath("//button[contains(text(),'Add new')]");
	By firstname=By.id("Address_FirstName");
	By lastname=By.id("Address_LastName");
	By email=By.id("Address_Email");
	By company=By.id("Address_Company");
	By country=By.id("Address_CountryId");
	By state=By.id("Address_StateProvinceId");
	By city=By.id("Address_City");
	By address1=By.id("Address_Address1");
	By postalcode=By.id("Address_ZipPostalCode");
	By phonenumber=By.id("Address_PhoneNumber");
	By faxnumber=By.id("Address_FaxNumber");
	By savebutton=By.xpath("//button[contains(text(),'Save')]");
	
	//constructor
	public Saveaddress(WebDriver driver) {
		this.driver=driver;
	}
	
	//action
	public void addressfillup(String fname,String lname,String emailid,String companyname,String cityname,String add,String pin,String phnumber,String fnumber) {
		driver.findElement(myaccount).click();
		driver.findElement(addressSection).click();
		driver.findElement(addNewbutton).click();
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(company).sendKeys(companyname);
		WebElement selectcountry=driver.findElement(country);
		Select select1=new Select(selectcountry);
		select1.selectByVisibleText("India");
		WebElement selectstate=driver.findElement(state);
		Select select2=new Select(selectstate);
		select2.selectByVisibleText("West Bengal");
		driver.findElement(city).sendKeys(cityname);
		driver.findElement(address1).sendKeys(add);
		driver.findElement(postalcode).sendKeys(pin);
		driver.findElement(phonenumber).sendKeys(phnumber);
		driver.findElement(faxnumber).sendKeys(fnumber);
		driver.findElement(savebutton).click();
	}

}
