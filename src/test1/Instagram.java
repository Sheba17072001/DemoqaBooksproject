package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.instagram;
public class Instagram {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
	}
	
@Test
public void inatgramtest()
{
	instagram  ob=new instagram(driver);
	ob.setvalues("9946402648", "9846237740");
	ob.login();
}
}
