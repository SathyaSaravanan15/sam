package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BaseClass {
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Update Cart']")
	private WebElement scroll4;
	public WebElement getScroll4() {
		return scroll4;
			}
	@FindBy(xpath="//a[text()='Proceed to Checkout']")
	private WebElement checkOut ;
	public WebElement getCheckOut() {
		return checkOut;
			}
	


}
