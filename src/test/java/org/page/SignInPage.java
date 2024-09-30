package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass {
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h5[text()='Please enter your username and password.']")
	private WebElement scroll2;
	public WebElement getScroll2() {
		return scroll2;
}

    @FindBy(xpath="//input[@name='username']")
	private WebElement userName;
    public WebElement getuserName() {
	return userName;
 }
   @FindBy(xpath="//input[@name='password']")
   private WebElement password;
    public WebElement getPassword() {
	return password;
		}
@FindBy(xpath="//button[text()='Login']")
private WebElement login;
public WebElement getLogin() {
	return login;
}

}
