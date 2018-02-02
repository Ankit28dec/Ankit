import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	public static void main(String[] args) throws Exception {

		String username=getCellData(1,1);
		System.out.println("======="+username);
		String password=getCellData(1,2);
		System.out.println("======="+password);
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			FileInputStream ExcelFile = new FileInputStream("C:\\Users\\454339.CTS\\Desktop\\TestData.xlsx");

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet("Sheet1");

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}

}
