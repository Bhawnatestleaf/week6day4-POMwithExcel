package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		LoginPage lp = new LoginPage(driver);
		return lp;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//LoginPage lp = new LoginPage();
		//return lp;
		return new LoginPage(driver);
	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	   // WelcomePage wp = new WelcomePage();
	    //return wp;
		return new WelcomePage(driver);
	    
	
	}

	

}
