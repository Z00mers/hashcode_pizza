package com.google.hashcode.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

  private String filename;

  public FileParser(String fileToOpen){

    filename = fileToOpen;

  }

  public List<String> parseRowsFromFile(){

    List<String> rows = new ArrayList<>();

    try
    {
      BufferedReader fileReader = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = fileReader.readLine()) != null)
      {
        rows.add(line);
      }
      fileReader.close();
      return rows;
    }
    catch (Exception e)
    {
      System.err.format("Exception occurred trying to read '%s'.", filename);
      e.printStackTrace();
      return null;
    }

  }

  public InputData parseFile(){

    InputData result;

    List<String> rows = parseRowsFromFile();

    int n = rows.size() - 1;          // One is the header

    // ToDo add the row number check (row number cant be < 2)

    String header = rows.get(0);

    String[] params = header.split("\\s+");
    int rowNumber = Integer.parseInt(params[0]);
    int columnNumber = Integer.parseInt(params[1]);
    int minIngedients = Integer.parseInt(params[2]);
    int maxSliceSize = Integer.parseInt(params[3]);

    int m = rows.get(1).toCharArray().length;

    char[][] dataMatrix = new char[m][n];

    for(int i=1; i<rows.size(); i++){
      dataMatrix[i] = rows.get(i).toCharArray();
    }

    result = new InputData(rowNumber, columnNumber, minIngedients, maxSliceSize, dataMatrix);

    return result;

  }



}
