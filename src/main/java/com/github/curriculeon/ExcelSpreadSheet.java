package com.github.curriculeon;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

/**
 * @author leonhunter
 * @created 01/24/2020 - 10:44 PM
 */
public class ExcelSpreadSheet {
    private final XSSFSheet sheet;

    public ExcelSpreadSheet(XSSFSheet sheet) {
        this.sheet = sheet;
    }

    public void applyFormulaOnCell(ExcelFormula forumla, Cell cell) {

    }

    public Cell getCell(Integer row, Integer column) {
        return getCell(row, getColumnName(column));
    }

    public Cell getCell(Integer row, String column) {
        return null;
    }

    public String getColumnName(Integer columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            int index = (columnNumber - 1) % 26;
            res.append((char)(index + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }

        return res.reverse().toString();
    }

    public void applyFormulaOnColumn(ExcelFormula forumla, Integer columnNumber) {

    }

    public List<String> getRow(String columnName) {
        return null;
    }

    public List<String> getColumn(String columnName) {
        return null;
    }

    private List<String> getColumn(Integer columnNumber) {
        return getColumn(getColumnName(columnNumber));
    }

    public List<List<String>> getColumns() {
        return null;
    }

    public List<List<String>> getRows() {
        return null;
    }
}
