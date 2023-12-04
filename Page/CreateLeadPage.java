package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class CreateLeadPage  extends ProjectSpecificMethod{
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	public CreateLeadPage enterCompanyname(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("compName");
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fNmame");
		return this;

    }
	public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lname");
		return this;
		
		
	}
	public CreateLeadPage enterPhno(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("phno");
		return this;
	
	}
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.id("submitButton")).click();
		return new ViewLeadPage(driver);
		
	}
}