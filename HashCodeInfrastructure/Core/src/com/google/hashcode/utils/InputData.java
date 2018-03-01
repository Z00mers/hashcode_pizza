package com.google.hashcode.utils;

public class InputData {

  int rowNumber, columnNumber;
  int minIngredientsInSlice;
  int maxSizeOfSlice;

  char[][] dataMatrix;

  public InputData(int rowN, int colN, int minIngred, int maxSliceSize, char[][] data){

    rowNumber = rowN;
    columnNumber = colN;
    minIngredientsInSlice = minIngred;
    maxSizeOfSlice = maxSliceSize;
    dataMatrix = data;

  }

  public int getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(int rowNumber) {
    this.rowNumber = rowNumber;
  }

  public int getColumnNumber() {
    return columnNumber;
  }

  public void setColumnNumber(int columnNumber) {
    this.columnNumber = columnNumber;
  }

  public int getMinIngredientsInSlice() {
    return minIngredientsInSlice;
  }

  public void setMinIngredientsInSlice(int minIngredientsInSlice) {
    this.minIngredientsInSlice = minIngredientsInSlice;
  }

  public int getMaxSizeOfSlice() {
    return maxSizeOfSlice;
  }

  public void setMaxSizeOfSlice(int maxSizeOfSlice) {
    this.maxSizeOfSlice = maxSizeOfSlice;
  }

  public char[][] getDataMatrix() {
    return dataMatrix;
  }

  public void setDataMatrix(char[][] dataMatrix) {
    this.dataMatrix = dataMatrix;
  }
}
