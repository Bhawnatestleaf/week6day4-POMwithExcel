package Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Page.LoginPage;

public class CreateLeadTC_003 extends ProjectSpecificMethod{
	
@Test(dataProvider="fetchData")
 
public void runCreateLead(String cname,String fname,String lname,String phno) {
	
	new LoginPage(driver)
	.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.clickCrmsfaLink()
	.clickLeadsTab()
	.clickCreateLead()
	.enterCompanyname(cname)
	.enterFirstName(fname)
	.enterLastName(lname)
	.enterPhno(phno)
	.clickSubmitButton()
	.verifyCreateLead();
	
	
	
	
	
}

@BeforeTest
public void setData() {
	excelFileName = "Createlead";
	
	
	
	
	
	
	
	
}
}

