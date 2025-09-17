package maintest;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import pages.AddtoWishlistAndtoComparelist;
import pages.Billingaddress;
import pages.CheckOut;
import pages.Confirm;

import pages.LogOutandLogIn;
import pages.OrderProduct;

import pages.Payment;
import pages.PaymentInfo;
//import pages.OrderProduct;
import pages.Register_page;
import pages.Saveaddress;
import pages.SearchProducts;
import pages.Shipping;

public class AllTest1 {
	
	String fname="Pritam";
	String lname="Shee";
	String email="pritam"+System.currentTimeMillis()+"@gmail.com";
	String company="Wipro";
	String pwd="Iam@2002";
	String cpwd="Iam@2002";
	String cityname="Kolkata";
	String add="Howrah";
	String pin="711114";
	String phnumber="9123974674";
	String fnumber="120290876";
	String newpwd="Iam@9999";
	String cnewpwd="Iam@9999";
	String product1="Apple Macbook Pro";
	String product2="Samsung";
	String product3="Camera";
	String product4="Htc";
	
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void registration() {
		Register_page registerpage=new Register_page(driver);
		registerpage.register(fname,lname,email,company,pwd,cpwd);
	}
	
	@Test(priority=2)
	public void logoutandlogin() {
		LogOutandLogIn logobj=new LogOutandLogIn(driver);
		logobj.loginfillup(email,pwd);
	}
	
	@Test(priority=3)
	public void filladdress() {

		Saveaddress addressobj=new Saveaddress(driver);
		addressobj.addressfillup(fname, lname, email, company, cityname, add, pin, phnumber, fnumber);
		
	}
	
	@Test(priority=4)
	public void  compareandwishlist() {
		AddtoWishlistAndtoComparelist addwishandcompareobj=new AddtoWishlistAndtoComparelist(driver);
		addwishandcompareobj.addproduct(product3,product4);
	}
	
	@Test(priority=5)
	public void addtocart() {
		SearchProducts productobj=new SearchProducts(driver);
		productobj.productSearch(product1, product2);
	}
	
	@Test(priority=6)
	public void gotocart() {
		OrderProduct orderproductobj=new OrderProduct(driver);
		orderproductobj.cart();
	}
	
	@Test(priority=7)
	public void checkout() {
		CheckOut checkoutobj=new CheckOut(driver);
		checkoutobj.getcheckout();
	}
	
	@Test(priority=8)
	public void billingaddress() {
		Billingaddress billingaddressobj=new Billingaddress(driver);
		billingaddressobj.billingaddresscontinue();
	}
	
	@Test(priority=9)
	public void shipping() {
		Shipping shippingobj=new Shipping(driver);
		shippingobj.getshipping();
	}
	
	@Test(priority=10)
	public void payment() {
		Payment paymentobj=new Payment(driver);
		paymentobj.getpayment();
	}
	
	@Test(priority=11)
	public void paymentinfo() {
		PaymentInfo paymentinfoobj=new PaymentInfo(driver);
		paymentinfoobj.getpaymentinfo();
		
	}
	@Test(priority=12)
	public void orderconfirm() {
		Confirm confirmobj=new Confirm(driver);
		confirmobj.getconfirm();
		
	}
	
	
	
		
		
		
		
		
	

}
