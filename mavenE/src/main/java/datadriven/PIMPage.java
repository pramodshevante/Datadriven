package datadriven;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;


	
	public class PIMPage extends BaseClass {
		
		public void addBtn()
		{
			driver.findElement(By.id("btnAdd")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		}
		
		public void addEmp(String name, String mname, String lname)
		{
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(name);
			driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(mname);
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
		}
		
		public  void saveEmpBtn()
		{
			driver.findElement(By.id("btnSave")).click();
		}

	}



