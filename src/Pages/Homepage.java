package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	
	
	WebDriver driver;
	By loginbutton=By.id("login");
	



public Homepage(WebDriver driver) {
	this.driver=driver;
}

public void login()
{
	driver.findElement(loginbutton).click();
}
}