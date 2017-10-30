package com.github.pdfsearch.filter;

import java.io.File;
import java.io.FileFilter;

/**
 * TODO: isudijov write JavaDoc
 */
public class PdfFilter implements FileFilter {

  @Override
  public boolean accept(File file) {
    return file.isFile() && file.getName().endsWith(".pdf");
  }
}
