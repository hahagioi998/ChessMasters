package com.chessmaster.pieces;

public class Rook {

  public String color;
  public int power;
  public int id;
  public int row;
  public int column;

  public Rook() {}

  public Rook(String color, int row, int column) {

    this.color = color;
    this.power = 5;
    this.id = 4;
    this.row = row;
    this.column = column;
  }

  public boolean isMoveValid(int moveRow, int moveColumn) {
    int changeInRow = Math.abs(moveRow - this.row);
    int changeInColumn = Math.abs(moveColumn - this.column);
    if (changeInRow != 0 ^ changeInColumn != 0) {
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
