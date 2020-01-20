package com.chessmaster.test;

import com.chessmaster.pieces.Queen;

public class QueenTest {

  private static Queen queen = new Queen("WHITE", 1, 4);

  public static void testIfVigureIsMovingCorrectly() {
    System.out.println("Test if queen is moving correctly");

    System.out.println("Can Queen go to 1:6 (true): " + queen.isMoveValid(1, 6));

    System.out.println("Can Queen go to 3:4 (true): " + queen.isMoveValid(3, 4));
  }

  public static void testIfQueenCannotMove() {
    System.out.println("Can Queen go to 3:5 (false): " + queen.isMoveValid(3, 5));
    System.out.println("Can Queen go to 5:6 (false): " + queen.isMoveValid(5, 6));
  }

  public static void run() {
    testIfVigureIsMovingCorrectly();
    testIfQueenCannotMove();
  }
}
