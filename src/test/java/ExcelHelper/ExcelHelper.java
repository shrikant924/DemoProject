package ExcelHelper;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHelper {

    static Cell cell1;
    static Sheet sheet;
    static Row row;

    public static void main(String[] args) throws IOException {
        //create an object of file class to open xlsx file
        File file = new File("D:\\dataDriven.xlsx");
        //create an object of FileInputStream class to read excel file
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        System.out.println(workbook.getActiveSheetIndex());
        System.out.println(workbook.getSheetName(0));
        sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        System.out.println("Row Count : " + rowCount);
        for (int i = 0; i <= rowCount; i++) {

            row = sheet.getRow(i);

            for (int j = 0; j < row.getLastCellNum(); j++) {

                //System.out.println(row.getCell(j).getStringCellValue()+" || ");

                cell1 = sheet.getRow(i).getCell(j);
                switch (cell1.getCellType()) {

                    case STRING:
                        System.out.print(row.getCell(j).getStringCellValue() + " || ");
                        break;

                    case NUMERIC:
                        System.out.print(row.getCell(j).getNumericCellValue() + " || ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
