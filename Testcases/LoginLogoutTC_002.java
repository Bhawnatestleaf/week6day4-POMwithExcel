package Testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Page.LoginPage;

public class LoginLogoutTC_002 extends ProjectSpecificMethod{
   
	
	@Test
	public void runLogout() {
	LoginPage lp = new LoginPage(driver);
	System.out.println("Logout : + driver");
    lp.enterUsername()
    .enterPassword()
    .clickLoginButton()
    .clickCrmsfaLink();
	
	
	}
}
