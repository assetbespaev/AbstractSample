package com.apachpoi.sample;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class CreateParagraph {

	public static void main(String[] args) throws Exception {
		XWPFDocument document = new XWPFDocument();
		FileOutputStream out = new FileOutputStream(new File("createParagraph.docx"));
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setText("At tutorialspoint.com, we strive hard to "
				+ "provide quality tutorials for self-learning "
				+ "purpose in the domains of Academics, Information "
				+ "Technology, Management and Computer Programming Languages.");

		document.write(out);
		out.close();
		System.out.println("createparagraph.docx written successfully");
	}
}
