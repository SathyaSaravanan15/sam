package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrderPage extends BaseClass {
	public MyOrderPage() {
		PageFactory.initElements(driver, this);
	}
	    @FindBy(xpath="//a[text()='My Orders']")
	    private WebElement myOrder;
		public WebElement getMyOrder() {
			return myOrder;	
		}
	    
		@FindBy(xpath="//a[text()='My Orders']")
		private WebElement myOrderList;
		public WebElement getMyOrderList() {
			return myOrderList;	
		}
		@FindBy(xpath="//input[@placeholder=\"Product Search\"]")
		private WebElement search;
		public WebElement getSearch() {
			return search;
		}
        @FindBy(xpath="//button[text()='Search']")
        private WebElement searchClick;
		public WebElement getSearchClick() {
			return searchClick;
		}
        @FindBy(xpath="//a[text()='Sign Out']")
        private WebElement signOut;
		public WebElement getSignOut() {
			return signOut;
		}


}
