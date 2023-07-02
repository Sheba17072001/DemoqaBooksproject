 package Pkg1;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon 
{

	
EdgeDriver driver;

	
	
	@Before
	public void setUp() 
	{
		driver=new EdgeDriver();
		driver.get("https://www.Amazon.in");
	}
	
	@Test
	public void test1()
	{


	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone14",Keys.ENTER);
	
	
	


	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ammus123@gmail.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.navigate().back();
	driver.navigate().back();
	
	
	  String actualtitle=driver.getTitle();
	  System.out.println(actualtitle);
	}


}
