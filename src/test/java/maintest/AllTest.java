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

public class AllTest {
	
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
	@Test
	public void endToendtest() {
		//testcase1 :register
		
		Register_page registerpage=new Register_page(driver);
		registerpage.register(fname,lname,email,company,pwd,cpwd);
		
		//testcase2 : logout after registation
		
		LogOutandLogIn logobj=new LogOutandLogIn(driver);
		logobj.loginfillup(email,pwd);
		
		//testcase3 : go to my account and fill address
		
		Saveaddress addressobj=new Saveaddress(driver);
		addressobj.addressfillup(fname, lname, email, company, cityname, add, pin, phnumber, fnumber);
		
		//testcase4 : serach product and add to compare and wishlist
		AddtoWishlistAndtoComparelist addwishandcompareobj=new AddtoWishlistAndtoComparelist(driver);
		addwishandcompareobj.addproduct(product3,product4);
		
		//testcase5 : searching products and add to cart
		SearchProducts productobj=new SearchProducts(driver);
		productobj.productSearch(product1, product2);
		
		//testcase6 : go to cart
		OrderProduct orderproductobj=new OrderProduct(driver);
		orderproductobj.cart();
		
		//test7 : check out
		CheckOut checkoutobj=new CheckOut(driver);
		checkoutobj.getcheckout();
		
		//test8 : billing address continue
		Billingaddress billingaddressobj=new Billingaddress(driver);
		billingaddressobj.billingaddresscontinue();
		
		//test9 : shipping 
		Shipping shippingobj=new Shipping(driver);
		shippingobj.getshipping();
		
		//test10 : payment
		Payment paymentobj=new Payment(driver);
		paymentobj.getpayment();
		
		//test11: paymentinfo
		PaymentInfo paymentinfoobj=new PaymentInfo(driver);
		paymentinfoobj.getpaymentinfo();
		
		//test12 : order confirm
		Confirm confirmobj=new Confirm(driver);
		confirmobj.getconfirm();
		
		
	}

}
