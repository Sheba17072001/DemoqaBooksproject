package Pkg1;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitscript {
  ChromeDriver driver;
  
  @Before
  public void setUp()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.Google.com");
  }
  
  @Test
  public void test1()
  {
	  driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
	  //driver.findElement(by.name("btnk")).click();
	  
	  
	  String actualtitle=driver.getTitle();
	  System.out.println(actualtitle);
  }
 
	}
