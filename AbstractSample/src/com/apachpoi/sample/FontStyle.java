package com.apachpoi.sample;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class FontStyle {
	public static void main(String[] args) throws Exception {
		XWPFDocument document = new XWPFDocument();
		FileOutputStream out = new FileOutputStream(new File("fontStyle.docx"));

		XWPFParagraph paragraph = document.createParagraph();

		XWPFRun paragraphOneRunOne = paragraph.createRun();
		paragraphOneRunOne.setBold(true);
		paragraphOneRunOne.setItalic(true);
		paragraphOneRunOne.setText("Font Style One");
		paragraphOneRunOne.addBreak();

		XWPFRun paragraphOneRunTwo = paragraph.createRun();
		paragraphOneRunTwo.setText("Font Style Two");
		paragraphOneRunTwo.setTextPosition(100);

		XWPFRun paragraphOneRunThree = paragraph.createRun();
		paragraphOneRunThree.setStrike(true);
		paragraphOneRunThree.setFontSize(20);
		paragraphOneRunThree.setSubscript(VerticalAlign.SUBSCRIPT);
		paragraphOneRunThree.setText(" Different Font Styles");
        
		document.write(out);
		out.close();
		System.out.println("fontstyle.docx written successully");
		
	}
}
