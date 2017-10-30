package com.github.pdfsearch;

import com.github.pdfsearch.filter.PdfFilter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import java.io.File;
import java.io.IOException;

/**
 * TODO: isudijov write JavaDoc
 */
public class StringFinderInPdf {

  public static void main(String[] args) throws IOException {
    String path = "C:\\data\\dev\\pdf";

    File directory = new File(path);
    File[] pdfFiles = directory.listFiles(new PdfFilter());
    PdfDocument pdfDocument = new PdfDocument(new PdfReader(pdfFiles[0]));
    int numberOfPages = pdfDocument.getNumberOfPages();
    for (int i = 1; i <= numberOfPages; i++) {
      PdfPage page = pdfDocument.getPage(i);
      String textFromPage = PdfTextExtractor.getTextFromPage(page);
      System.out.println(textFromPage);
    }
    Runtime.getRuntime().exec("Acrobat /A \"page=3\" " + pdfFiles[0].getAbsolutePath());
  }



}

