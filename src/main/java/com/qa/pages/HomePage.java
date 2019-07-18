package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testbase.Testbase;

public class HomePage extends Testbase{
		
		@FindBy(xpath="//td[contains(text(),'User: naveen k')]")
		WebElement userNameLabel;
		
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		public String validateHomePageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateUserNameLabel(){
			return userNameLabel.isDisplayed();
		}
		
	}

