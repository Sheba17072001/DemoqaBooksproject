package Pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
		
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

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ammus123@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ammuammuz");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		  
		  String actualtitle=driver.getTitle();
		  System.out.println(actualtitle);
		}
		
	}



