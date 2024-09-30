package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage  extends BaseClass{
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//button[text()='Confirm']")
		private WebElement confirm;
		public WebElement getConfirm() {
			return confirm;	
		}
		@FindBy(xpath="//button[text()='Update Cart']")
			private WebElement update;
			public WebElement getUpdate() {
				return update;	
				}
		@FindBy(xpath="//button[text()='Continue']")
			private WebElement continue1 ;
			public WebElement getContinue1() {
				return continue1;	
				}

}
