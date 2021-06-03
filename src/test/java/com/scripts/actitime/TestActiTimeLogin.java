package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pages.actitime.POMActiTimeLoginPage;

public class TestActiTimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActiTimeLoginPage login=new POMActiTimeLoginPage(driver);
		login.loginMethod();
	}
}
