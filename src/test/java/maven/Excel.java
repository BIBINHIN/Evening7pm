package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f=new File("C:\\Users\\S.Radha\\eclipse-workspace\\Sample\\excel\\Book detail.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh=book.getSheet("sheet");
		int c=sh.getPhysicalNumberOfRows();
		System.out.println("Row count:"+c);
		
		for (int i=0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r= sh.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell p=r.getCell(j);
			System.out.println(p);
			
		Row row= sh.createRow(3);
		Cell cell1 = row.createCell(0);
		cell1.setCellValue("blue");
		Cell cell2 = row.createCell(1);
		cell2.setCellValue("9962242");
		Cell cell3 = row.createCell(2);
		cell3.setCellValue("459");
		
		FileOutputStream fou= new FileOutputStream(f);
		book.write(fou);
		
		}	
      }
}		
			
}
