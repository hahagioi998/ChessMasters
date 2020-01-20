package com.chessmaster.pieces;

public class Bishop {

  public String color;
  public int power;
  public int id;
  public int row;
  public int column;

  public Bishop() {}

  public Bishop(String color, int row, int column) {

    this.color = color;
    this.power = 5;
    this.id = 2;
    this.row = row;
    this.column = column;
  }

  public boolean isMoveValid(int moveRow, int moveColumn) {
    int changeInRow = Math.abs(moveRow - row);
    int changeInColumn = Math.abs(moveColumn - column);

    if (changeInRow == changeInColumn) {
      return true;
    }

    return false;
  }

  public void move(int row, int column) {
    if (isMoveValid(row, column) == true) {
      this.row = row;
      this.column = column;
    }
  }
}
