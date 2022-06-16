package datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader extends BaseClass {

	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public  ExcelReader(String excelpath)
	{
		File f=new File(excelpath);
		
		try
		{
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}}
	
	public String getData(int sheetindex, int row, int cell)
	{
		sheet= workbook.getSheetAt(sheetindex);
		
		return sheet.getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	public int rowCount(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getLastRowNum();
	}
	
	public int coloumCount(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

}
