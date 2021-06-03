package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutuConstant;
import com.generics.actitime.ExcelLibrary;

public class POMActiTimeLoginPage implements AutuConstant
{
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement usernameTextField;
	
	@FindBy(css = "input[name='pwd']")
	private WebElement passwordnameTextfield;
	
	@FindBy(id = "loginButton")
	private WebElement loginutton;
	
	public POMActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 0));
		passwordnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
		loginutton.click();
	}
	

}
