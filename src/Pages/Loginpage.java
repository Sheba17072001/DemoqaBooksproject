package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
     By username=By.id("userName");
     By password=By.id("password");
     By loginbutton=By.id("login");
     By newUserbutton=By.id("newUser");
     
     
     public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String user,String pass)
     {
    	driver.findElement(username).sendKeys(user);
    	 driver.findElement(password).sendKeys(pass);
     }
     public void login()
     {
    	 driver.findElement(loginbutton).click();
    	 
     }
    
     
	 
}
