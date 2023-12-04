package Testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Page.LoginPage;

public class LoginTC_001 extends ProjectSpecificMethod{
@Test
	public void runLogin() {
		/*LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLoginButton();
		WecomePage wp = new Welcome Page();
		wp.clickCrmsfaLink();*/
	System.out.println("Login : " + driver);
	LoginPage lp = new LoginPage(driver);
	@SuppressWarnings("unused")
	String name = new String ("Testleaf");
	lp.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.verifyingLoginPage()
	.clickCrmsfaLink();
	
		
		
		
	}

}
