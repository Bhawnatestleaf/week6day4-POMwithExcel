package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	
	public WelcomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	

	public WelcomePage() {
		// TODO Auto-generated constructor stub
	}


	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	
	public LoginPage clickLogoutButton() {
		System.out.println("Logout successfull");
		return new LoginPage(driver);
		
	}
	
	public WelcomePage verifyingLoginPage() {
		System.out.println("Login successfull");
		WelcomePage wp=new WelcomePage();
		return wp;
		
}
}
