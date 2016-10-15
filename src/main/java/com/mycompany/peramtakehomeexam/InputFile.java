/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.peramtakehomeexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Vinod Kumar Reddy Peram
 */
public class InputFile {
     private static final String FILE_PATH = "Peram_input.xlsx";

   
/*
    * method to get list of movies from the input excel file
*/
    public  List getSongsListFromExcel() {
        List songList = new ArrayList();
        FileInputStream fis = null;
         
        try {
            fis = new FileInputStream(FILE_PATH);

            
            /*
              Use XSSF for xlsx format, for xls use HSSF
            */
            Workbook workbook = new XSSFWorkbook(fis);

            int numberOfSheets = workbook.getNumberOfSheets();

          
            
            /*
            looping over each workbook sheet
            */
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                Iterator rowIterator = sheet.iterator();

                
            /*
                iterating over each row
                */
                while (rowIterator.hasNext()) {

                    Song song = new Song();
                    Row row = (Row) rowIterator.next();
                    
                    
                  
                         Iterator cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                       
                        Cell cell = (Cell) cellIterator.next();
                     
                   
                       
                        if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                           
                            
                           
                            if (cell.getColumnIndex() == 1) {
                                 song.setAlbumname(cell.getStringCellValue());
                            }
                            
                            
                           
                            if (cell.getColumnIndex() == 2) {
                                 song.setGenre(cell.getStringCellValue());
                            }
                            
                            
                            
                            if (cell.getColumnIndex() == 3) {
                                 song.setArtist(cell.getStringCellValue());
                            }
                     
                        }
                        
                       
                        else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {

                            
                            
                            if (cell.getColumnIndex() == 0) {
                                song.setSno((int) cell.getNumericCellValue());
                            }
                            
                          
                            else if (cell.getColumnIndex() == 5) {
                                song.setCriticscore((int)cell.getNumericCellValue());
                            }
                            
                           
                           else if (cell.getColumnIndex() == 4) {
                               Date dateValue = null;
                           
                                 if (DateUtil.isCellDateFormatted(cell)) {
                                 dateValue = cell.getDateCellValue();
                                 }
                                 song.setReleasedate(dateValue);
                            }
               

                        }
                    
                    }
                    
                   
                    songList.add(song);
                }
            }

            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return songList;
    }
}
