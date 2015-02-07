package com.apachpoi.sample;

import java.io.FileInputStream;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class WordExtractor {
	public static void main(String[] args) throws Exception {
		XWPFDocument document = new XWPFDocument(new FileInputStream(
				"alignParagraph.docx"));
		XWPFWordExtractor we = new XWPFWordExtractor(document);
		System.out.println(we.getText());

	}
}
