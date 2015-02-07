package com.apachpoi.sample;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class CreateDocument {
	public static void main(String[] args) throws Exception {
		XWPFDocument document = new XWPFDocument();
		FileOutputStream out = new FileOutputStream(new File(
				"createDocument.docx"));
		document.write(out);
		out.close();
		System.out.println("createdocument.docx written successully");
	}
}
