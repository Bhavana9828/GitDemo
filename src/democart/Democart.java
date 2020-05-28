package democart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Democart {

public WebDriver driver;
public Democart(WebDriver rdriver)
{
	driver=rdriver;
	PageFactory.initElements(rdriver, this);
}

	
   public void clickMyAccount()
	{
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	}
	
	public void loginButn()
	{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']")).click();
	}
	
	public void setEmail()
	{
		driver.findElement(By.id("input-email")).sendKeys("bhavana123@gmail.com");
	     
	}
	
	
	public void setPsw()
	{
		driver.findElement(By.name("password")).sendKeys("bhavana123");	
	     	}	
	
	public void clickLogin()
	{
		 driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();	
	}	
	
	public void clickLogout()
	{
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:last-of-type")).click();
		
		}
	}
