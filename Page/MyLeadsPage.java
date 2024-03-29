package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod {
	
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
		
	}

}
