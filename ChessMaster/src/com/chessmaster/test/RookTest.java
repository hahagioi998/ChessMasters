package com.chessmaster.test;

import com.chessmaster.pieces.Rook;

public class RookTest {
  private static Rook testRook = new Rook("WHITE", 1, 1);

  public static void testIfRookCanMove() {
    System.out.println("Test if Rook is moving correctly");
    System.out.println("Check If rook can move to 3:1 (true): " + testRook.isMoveValid(3, 1));
    System.out.println("Check if rook can move to 1:5 (true): " + testRook.isMoveValid(1, 5));
  }

  public static void testIfRookCannotMove() {
    System.out.println("check if rook can move to 3:2 (false): " + testRook.isMoveValid(3, 2));
    System.out.println("check if rook can move to 4:8 (false): " + testRook.isMoveValid(4, 8));
  }

  public static void run() {
    testIfRookCanMove();
    testIfRookCannotMove();
  }
}
