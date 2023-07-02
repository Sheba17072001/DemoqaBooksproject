package Pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("gmail"))
		{
			System.out.println("test is present");
		}
		else
		{
			System.out.println("test is not present");
		}
	}

}
