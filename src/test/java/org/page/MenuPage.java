package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends BaseClass{
	public MenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[text()='Bulldog']")
	private WebElement scroll3;
	public WebElement getScroll3() {
		return scroll3;
			}
		
	@FindBy(xpath="//a[text()='Dogs']")
	private WebElement dogsInfo;
	public WebElement getDogsInfo() {
		return dogsInfo;
	}
	@FindBy(xpath="//a[text()='K9-BD-01']")
	private WebElement bullDog;
	public WebElement getBullDog() {
		return bullDog;
	}
	@FindBy(xpath="(//a[text()='Add to Cart'])[2]")
	private WebElement femaleBullDog; 
	public WebElement getFemaleBullDog() {
		return femaleBullDog;
			}
	@FindBy(xpath="//a[text()='Add to Cart']")
	private WebElement maleBullDog;
	public WebElement getMaleBullDog() {
		return maleBullDog;
	}

}
