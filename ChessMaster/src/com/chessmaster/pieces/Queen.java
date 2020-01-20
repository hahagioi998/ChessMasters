package com.chessmaster.pieces;

public class Queen {

  public String color;
  public int power;
  public int id;
  public int row;
  public int column;

  public Queen(String color, int row, int column) {

    this.color = color;
    this.power = 10;
    this.id = 6;
    this.row = row;
    this.column = column;
  }

  public boolean isMoveValid(int moveRow, int moveColumn) {
    Rook rook = new Rook(color, row, column);
    Bishop bishop = new Bishop(color, row, column);
    if (rook.isMoveValid(moveRow, moveColumn) ^ bishop.isMoveValid(moveRow, moveColumn)) {
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
