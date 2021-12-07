package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Acerek\\Documents\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
		d.get("https://www.phptravels.net/login");
		d.findElement(By.id("email")).sendKeys("user@phptravels.com");
		d.findElement(By.id("password")).sendKeys("demouser");
		d.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
		String u=d.getCurrentUrl();
		if(u.equals("https://www.phptravels.net/account/dashboard"))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
	d.close();
		
		
		
	}

}
