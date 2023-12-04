package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public MyLeadsPage clickLeadsTab() {
		driver.findElement(By.linkText("leads")).click();
		
		return new MyLeadsPage(driver);
		
		
	}


}
