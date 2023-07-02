package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.fbloginpage;
public class Fbloginpage {
	
	WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}

@Test
public void fbtest()
{
fbloginpage ob=new fbloginpage(driver);

	ob.setvalues("ammus17@gmail.com", "ammus123");
	ob.login();
	
}
		
		
		
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
