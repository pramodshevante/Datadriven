package Testpak;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import datadriven.BaseClass;
import datadriven.ExcelReader;
import datadriven.HomePage;
import datadriven.Loginpage;
import datadriven.PIMPage;

public class Testing {


//	@Test(priority=0)
//	public void start()
//	{
//		BaseClass.init();
//	}
//	
	
	
	@Test(priority=1)
	public void Login()
	{
		Loginpage obj=new Loginpage();
		obj.loginData("Admin", "admin123");
		obj.loginBtn();
	}
	
	@Test(priority=2)
	public void HomeFct()
	{
		HomePage obj2= new HomePage();
		obj2.pimBtn();
	}
	
	@DataProvider(name="UserDetail")
	public Object[][] getData()
	{
		ExcelReader obj = new ExcelReader("C:\\Users\\FILMMAKER\\eclipse-workspace\\Orange\\src\\main\\java\\UtilsLayer\\UserData.xlsx");
		int rows=obj.rowCount(0);
		int cells=obj.coloumCount(0);
		Object[][] data=new Object[rows][cells];
		for(int i=0;i<rows;i++)
		{
			data[i][0]=obj.getData(0, i, 0);
			data[i][1]=obj.getData(0, i, 1);
			data[i][2]=obj.getData(0, i, 2);
		}
		return data;
	}
	@Test(dataProvider="UserDetail",priority=3)
	public void PimFct(String name, String mname, String lname) throws IOException
	{
		PIMPage obj3=new PIMPage();
		obj3.addBtn();
		obj3.addEmp(name,lname,lname);
	//	ScrenCapture.screnShot("Add Emp");
		obj3.saveEmpBtn();
	}
	
	

}

