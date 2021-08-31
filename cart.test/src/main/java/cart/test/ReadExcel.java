package cart.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	private static int counter;

	public static List<String> readValues(int index) {
		try {
//			File directory = new File("./");
//		    System.out.println(directory.getAbsolutePath());
			File file = new File("c:\\temp\\Configuratore.xlsx"); // creating a new file instance
//			InputStream in = getClass().getResourceAsStream("/file.txt");
//			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
			// creating Workbook instance that refers to .xlsx file
			List<String> retList = new ArrayList<>();

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(index); // creating a Sheet object to retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
			while (itr.hasNext()) {
				Row row = itr.next();
				StringBuffer sb = new StringBuffer();
				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
				counter = 1;
				while (cellIterator.hasNext()) {

					if (counter > 2)
						break;
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case STRING: // field that represents string cell type
						// System.out.print(cell.getStringCellValue() + "\t\t\t");
						sb.append(cell.getStringCellValue());
						sb.append(" -- ");
						break;
					case NUMERIC: // field that represents number cell type
						// System.out.print(cell.getNumericCellValue() + "\t\t\t");
						sb.append(cell.getNumericCellValue());

						break;
					default:
					}
					counter = counter + 1;

				}
				// System.out.println("");
				if (sb.length() > 3)
					retList.add(sb.substring(0, sb.length() - 4).toString());
			}
			return retList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
