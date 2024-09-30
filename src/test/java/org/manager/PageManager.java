package org.manager;

import org.base.BaseClass;
import org.page.HomePage;
import org.page.MenuPage;
import org.page.MyOrderPage;
import org.page.OrderPage;
import org.page.PaymentPage;
import org.page.ShoppingCartPage;
import org.page.SignInPage;

public class PageManager extends BaseClass {
	private  HomePage homePage;
	public HomePage getHomePage() {
		return(homePage==null) ? homePage=new HomePage(): homePage;
	}	
	private  SignInPage signInPage;
	public SignInPage getSignInPage() {
		return(signInPage==null) ? signInPage=new SignInPage():signInPage;
	}	
	private MenuPage menuPage;
	public MenuPage getMenuPage() {
		return (menuPage==null)?menuPage=new MenuPage():menuPage;
	}
	private ShoppingCartPage shoppingCartPage ;
	public ShoppingCartPage getShoppingCartPage() {
		return (shoppingCartPage==null)? shoppingCartPage=new ShoppingCartPage(): shoppingCartPage;
	}
	
	private PaymentPage  paymentPage;
	public PaymentPage getPaymentPage() {
		return (paymentPage==null)?paymentPage=new PaymentPage ():paymentPage;
}
	private OrderPage  orderPage;
	public OrderPage getOrderPage() {
		return (orderPage==null)?orderPage=new OrderPage  ():orderPage;
	}
	private MyOrderPage  myorderPage;
	public MyOrderPage getMyOrderPage() {
		return (myorderPage==null)?myorderPage=new MyOrderPage  ():myorderPage;
	}


}
