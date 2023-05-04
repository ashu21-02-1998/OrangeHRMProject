package org.OrangeHRMUtility;
import java.util.Properties;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileInputStream;
import java.io.IOException;
public class Utility {

	
	public static Object fetchPropertyValue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Configuration/config.properties");
	    Properties property =new Properties();
	    property.load(file);
	    return property.get(key);
	}
	
	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException 
	{
	  FileInputStream file=new FileInputStream("C:\\Eclipse IDE java programm files\\OrangeHRMProject\\TestData\\Login.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Login");
	  String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
	  return value;
	}	  
	
	
	
	
	
	
	
	
}
