package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.Loginpage;


public class Demoqa {
WebDriver driver;

	@BeforeTest
	public void setup()
	{
		 driver=new ChromeDriver ();
		driver.get("https://demoqa.com/books");
		
	}
	
	@Test
	public void Homepagetest()
	{
	Homepage ob=new Homepage(driver);	
	ob.login();
	}
	public void Loginpage()
	{
	Loginpage oh=new Loginpage(driver);
	oh.setvalues("Sheenabaiju", "yehovaraffa");
	oh.login();
	}
}
