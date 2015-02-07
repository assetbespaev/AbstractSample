package com.apachpoi.sample;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		XWPFDocument doc = new XWPFDocument();
		FileOutputStream out = new FileOutputStream(
				new File("createTable.docx"));

		XWPFTable table = doc.createTable();

		XWPFTableRow tableOneRow = table.getRow(0);
		tableOneRow.getCell(0).setText("col one, row one");
		tableOneRow.addNewTableCell().setText("col two, row one");
		tableOneRow.addNewTableCell().setText("col three, row one");

		XWPFTableRow tableTwoRow = table.createRow();
		tableTwoRow.getCell(0).setText("col one, row two");
		tableTwoRow.getCell(1).setText("col two, row two");
		tableTwoRow.getCell(2).setText("col three, row two");

		XWPFTableRow tableThreeRow = table.createRow();
		tableThreeRow.getCell(0).setText("col one, row three");
		tableThreeRow.getCell(1).setText("col two, row three");
		tableThreeRow.getCell(2).setText("col three, row three");

		doc.write(out);
		out.close();
		System.out.println("create_table.docx written successully");

	}

}
