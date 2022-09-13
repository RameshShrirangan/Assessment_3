package com.leaftaps.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String data) {
		WebElement ele = locateElement("username");
		clearAndType(ele, data);
		reportStep("Username is entered", "PASS");
		return this;
	}

	public LoginPage enterPassword(String data) {
		WebElement ele = locateElement("password");
		clearAndType(ele, data);
		reportStep("Password is entered", "PASS");
		return this;
	}

	public HomePage clickLogin() {
		click(locateElement(Locators.XPATH, "//input[@class='button r4 wide primary']"));
		reportStep("Logged In", "PASS");
		return new HomePage();
	}

	
}
