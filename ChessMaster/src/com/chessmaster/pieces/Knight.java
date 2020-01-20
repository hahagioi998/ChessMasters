package com.chessmaster.pieces;

public class Knight {

  public String color;
  public int power;
  public int id;
  public int row;
  public int column;

  public Knight(String color, int row, int column) {
    this.color = color;
    this.power = 5;
    this.id = 3;
    this.row = row;
    this.column = column;
  }

  public boolean isMoveValid(int moveRow, int moveColumn) {
    boolean isMovedByRows = Math.abs(moveRow - row) == 2 && Math.abs(moveColumn - column) == 1;
    boolean isMovedByColumns = Math.abs(moveRow - row) == 1 && Math.abs(moveColumn - column) == 2;
    if (isMovedByRows ^ isMovedByColumns) {
      return true;
    }
    return false;
  }

  public void move(int row, int column) {
    if (isMoveValid(row, column)) {
      this.row = row;
      this.column = column;
    }
  }
}
