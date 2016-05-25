package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String getCellvalue(String xlpath,String sheet,int r,int c)
	{
	String v="";
	try{
	Workbook wb = WorkbookFactory.create(new FileInputStream(xlpath));	
	v=wb.getSheet(sheet).getRow(r).getCell(c).toString();

	}
	catch(Exception e)
	{
		
	}
	return v;
	}
	public static int getRowcount(String xlpath,String sheet)
	{
	int rc=0;
	try{
	Workbook wb = WorkbookFactory.create(new FileInputStream(xlpath));	
	rc=wb.getSheet(sheet).getLastRowNum();

	}
	catch(Exception e)
	{
		
	}
	return rc;
	}
	

}
