package datadriven;

import org.openqa.selenium.By;



	
	public class HomePage extends BaseClass{
		
		public void pimBtn()
		{
			driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		}

	}

	
