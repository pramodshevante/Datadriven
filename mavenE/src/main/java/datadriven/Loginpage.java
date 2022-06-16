package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


	
	public class Loginpage extends BaseClass {
		
		public void loginData(String user, String pass)
		{
			WebElement wb=driver.findElement(By.xpath("//input[@id='txtUsername']"));
			wb.sendKeys(user);
			
			WebElement wb1=driver.findElement(By.xpath("//input[@id='txtPassword']"));
			wb1.sendKeys(pass);
					
		}
		
		public void loginBtn()
		{
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		}

	}

	
		
	

