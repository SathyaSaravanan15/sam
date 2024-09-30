package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass {
	public static BaseClass baseclass=new BaseClass();
	public static PageManager pageManager = new PageManager();
	@Given("User must be in HomePage")
	public void user_must_be_in_home_page() throws IOException {
		baseclass.getDriver();
		baseclass.geturl(baseclass.readExcel(1,1));
		baseclass.windowmax();
	}
	@When("User scroll the Homepage to SignIn")
	public void user_scroll_the_homepage_to_sign_in() {
		WebElement scroll = pageManager.getHomePage().getScroll();
		baseclass.scrollByJS("Down", scroll );
	    
	}
	@When("User click on Signin Option")
	public void user_click_on_signin_option() throws InterruptedException, IOException {
		WebElement signIn =  pageManager.getHomePage().getSignIn();
		baseclass.clickByJS(signIn);
		baseclass.screenCapture();
		Thread.sleep(2000);
			   	}
	@Given("User scrolldown that page")
	public void user_scrolldown_that_page() {
		WebElement scroll2 = pageManager.getSignInPage().getScroll2();
		baseclass.scrollByJS("Down", scroll2 );
	}
	@When("User enters UserName and Password")
	public void user_enters_user_name_and_password() throws IOException {
		WebElement userName = pageManager.getSignInPage().getuserName();
	    userName.clear();
	    baseclass.sendKeysByJava(userName, baseclass.readExcel(2, 1));
	    WebElement password1 = pageManager.getSignInPage().getPassword();
	    password1.clear();
	    password1.click();
	    baseclass.sendKeysByJava(password1 , baseclass.readExcel(3, 1));
	}
	@When("Click on Login Button")
	public void click_on_login_button() throws InterruptedException {
		WebElement login = pageManager.getSignInPage().getLogin();
	    login.click();
	    Thread.sleep(2000);
	}
	@Given("User Scroll the signin page")
	public void user_scroll_the_signin_page() {
		WebElement scroll2 = pageManager.getSignInPage().getScroll2();
		baseclass.scrollByJS("Down", scroll2 );
	}
	@When("User to enter username and password")
	public void user_to_enter_username_and_password() throws IOException {
		WebElement userName = pageManager.getSignInPage().getuserName();
	    userName.clear();
	    baseclass.sendKeysByJava(userName, baseclass.readExcel(2, 1));
	    WebElement password1 = pageManager.getSignInPage().getPassword();
	    password1.clear();
	    password1.click();
	    baseclass.sendKeysByJava(password1 , baseclass.readExcel(3, 1));
	}
	@When("User click on Login")
	public void user_click_on_login() throws InterruptedException, IOException {
		 WebElement login = pageManager.getSignInPage().getLogin();
		    login.click();
		    Thread.sleep(2000);
		    baseclass.screenCapture();
	}
	@When("User get information about dog")
	public void user_get_information_about_dog() {
		 WebElement dogsInfo = pageManager.getMenuPage().getDogsInfo();
		    dogsInfo.click();
	}
	@When("User Select Bulldogs and inthat select female dog")
	public void user_select_bulldogs_and_inthat_select_female_dog() throws InterruptedException, IOException {
		 WebElement bullDogs =pageManager.getMenuPage().getBullDog();
		    baseclass.clickByJS(bullDogs);
		    WebElement scroll3 = pageManager.getMenuPage().getScroll3();
	         baseclass.scrollByJS("Down", scroll3); 
	         Thread.sleep(1000);
	         WebElement femaleBullDog = pageManager.getMenuPage().getFemaleBullDog();
	 	    baseclass.clickByJS(femaleBullDog);
	 	    baseclass.screenCapture();
	 	    Thread.sleep(2000); 
	}
	@Given("User Scroll the ShoppingCartPage")
	public void user_scroll_the_shopping_cart_page() throws IOException, InterruptedException {
		WebElement scroll4 =pageManager.getShoppingCartPage().getScroll4();
	    baseclass.scrollByJS("Down", scroll4);  
	    baseclass.screenCapture();
	    Thread.sleep(2000);
	    
	}
	@When("User must click on Updatecart")
	public void user_must_click_on_updatecart() {
		WebElement update=pageManager.getOrderPage().getUpdate();
        update.click(); 
	}
	
    @When("User must click checkout")
   public void user_must_click_checkout() throws InterruptedException {
	 WebElement checkOut=pageManager.getShoppingCartPage().getCheckOut();
    checkOut.click();
	Thread.sleep(2000); 
}
    @When("User can Validate the Payment page")
    public void user_can_validate_the_payment_page() {
    	 WebElement payment =pageManager.getPaymentPage().getPayment();
	    if(payment.isDisplayed()) {
		    	System.out.println("User in PaymentPage");
		    }
		    else
		    {
	    	System.out.println("User not in PaymentPage");
		    }
    }
    @When("Click on continuebutton")
    public void click_on_continuebutton() {
    	WebElement continue1=pageManager.getOrderPage().getContinue1();
	    continue1.click();
    }
    @When("User Confirm their order")
    public void user_confirm_their_order() {
    	 WebElement confirm=pageManager.getOrderPage().getConfirm();
 	    confirm.click();
 	    		
    }@When("User can validate myOrderPage")
    public void user_can_validate_my_order_page() {
    	WebElement myOrder = pageManager.getMyOrderPage().getMyOrder();
	    if (myOrder.isDisplayed()) {
	    	System.out.println("User in MyOrderPage");
			
		} else {
	        System.out.println("User not in MyOrderPage");
		}
    }
    @When("User collect orderlist in list")
    public void user_collect_orderlist_in_list() throws InterruptedException {
    	WebElement myOrderList = pageManager.getMyOrderPage().getMyOrderList();
	    myOrderList.click();
	    Thread.sleep(2000);
    }
    @When("User Search the order of Fish")
    public void user_search_the_order_of_fish() throws InterruptedException {
    	 WebElement search = pageManager.getMyOrderPage().getSearch();
		    baseclass.sendKeysByJS(search, "Fish");
		    Thread.sleep(1000);
		    WebElement searchClick = pageManager.getMyOrderPage().getSearchClick();
		    searchClick.click();
		    Thread.sleep(2000);
    }
    @Then("User SignOut their Page")
    public void user_sign_out_their_page() {
    	WebElement signOut = pageManager.getMyOrderPage().getSignOut();
	    signOut.click();
    }

    
    
    
//	@When("User must click on ChechOut")
//	public void user_must_click_on_chech_out() throws InterruptedException {
//		 WebElement checkOut=pageManager.getShoppingCartPage().getCheckOut();
//		    checkOut.click();
//		    Thread.sleep(2000);
//	}
//	@When("validate Payment of PaymentPage")
//	public void validate_payment_of_payment_page() throws InterruptedException, IOException {
//		 WebElement payment =pageManager.getPaymentPage().getPayment();
//		    if(payment.isDisplayed()) {
//		    	System.out.println("User in PaymentPage");
//		    }
//		    else
//		    {
//		    	System.out.println("User not in PaymentPage");
//		    }
//	}
//@When("User must click on Updatecart")
//	public void user_must_click_on_updatecart() {
//		WebElement update=pageManager.getOrderPage().getUpdate();
//	    update.click();  
//	}
//		
//	@When("Click proceed button")
//	public void click_proceed_button() throws InterruptedException {
//	    
//		 WebElement proceed = pageManager.getShoppingCartPage().getCheckOut();
//		    proceed.click();
//		    Thread.sleep(3000);
//	}
//	@When("User must click checkOut")
//	public void user_must_click_check_out() throws InterruptedException {
//		WebElement continue1=pageManager.getOrderPage().getConfirm();
//	    continue1.click();
//	    Thread.sleep(2000);
//		WebElement confirm=pageManager.getOrderPage().getConfirm();
//	    confirm.click();
//	}
//
}
