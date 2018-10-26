package GoogleUtil;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config;
public class ExcelUtilityClass {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	try{
		FileInputStream ExcelFile = new FileInputStream("/GoogleApllicationJUNITDataDrivenFramework/src/GoogleTestData/GoogleTestDataExcel.xlsx");

	}catch(Exception e)
	{

	}
}

