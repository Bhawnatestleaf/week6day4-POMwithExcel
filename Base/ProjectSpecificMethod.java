package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethod {
	public  RemoteWebDriver driver;
	public String excelFileName;
		

		@BeforeMethod
		public void preCondition() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://leaftaps.com/opentaps/");
			
		}
		
		@AfterMethod
		public void postCondition() {
			driver.close();
		}
		
		@DataProvider(name="fetchData")
		public String[][] getData() throws IOException {
			
			
			return Utils.DataLibrary.readData(excelFileName);
		}
		
	}

