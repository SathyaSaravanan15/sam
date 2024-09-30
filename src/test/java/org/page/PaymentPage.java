package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClass{
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//h3[text()='Payment Details']")
		private WebElement payment;
		public WebElement getPayment() {
			return payment ;	
	}
		
		@FindBy(xpath="//button[text()='Continue']")
		private WebElement proceed;
		public WebElement getProceed() {
			return proceed;	
	}

}
