package Pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitfacebook {
	
	ChromeDriver driver;

	
	
	@Before
	public void setUp() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
	}
	
	
	@Test
	public void test1()
	{

	driver.findElement(By.id("email")).sendKeys("ammus123@gmail.com");
	
	driver.findElement(By.name("pass")).sendKeys("ammuammuz");
	driver.findElement(By.name("login")).click();
	

	  
	  String actualtitle=driver.getTitle();
	  System.out.println(actualtitle);
	}
	
}

