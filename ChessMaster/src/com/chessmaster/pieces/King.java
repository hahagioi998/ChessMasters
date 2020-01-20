package com.chessmaster.pieces;

public class King {

  public String color;
  public int power;
  public int id;
  public int row;
  public int column;

  public King(String color, int row, int column) {

    this.color = color;
    this.power = 6;
    this.id = 5;
    this.row = row;
    this.column = column;
  }

  public boolean isMoveValid(int moveRow, int moveColumn) {
    boolean isMovedByOneSquare = Math.abs(moveRow - row) == 1 || Math.abs(moveColumn - column) == 1;

    if (isMovedByOneSquare) {
      if (Math.abs(moveRow - row) > 1 || Math.abs(moveColumn - column) > 1) {
        return false;
      }
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
