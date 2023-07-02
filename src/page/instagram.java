package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class instagram {

	WebDriver driver;
	
	By instagramemail=By.name("username");
	By instagrampassword=By.name("password");
	By instagramlogin=By.name("submit");
}

public instagram(WebDriver driver) {
	this.driver=driver;
}
public void setvalues(String email,String password)
 {
	 driver.findElement(instagramemail).sendKeys(email);
	 driver.findElement(instagrampassword).sendKeys(password);
	 
 }
 public void login()
 {
	 driver.findElement(instagramlogin).submit();
 }
 }