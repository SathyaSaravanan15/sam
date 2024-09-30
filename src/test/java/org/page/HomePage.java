package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id=\"Logo\"]")
	private WebElement scroll;
	public WebElement getScroll() {
		return scroll;
	}	
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement signIn;
	public WebElement getSignIn()
	{
		return signIn;
	}

}
