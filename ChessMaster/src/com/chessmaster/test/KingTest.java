package com.chessmaster.test;

import com.chessmaster.pieces.King;

public class KingTest {
  private static King king = new King("WHITE", 1, 5);

  public static void testIfVigureIsMovingCorrectly() {
    System.out.println("Test if king is moving correctly");

    System.out.println("Can King go to 2:5 (true): " + king.isMoveValid(2, 5));

    System.out.println("Can King go to 1:6 (true): " + king.isMoveValid(1, 6));
  }

  public static void testIfKingCannotMove() {
    System.out.println("Can King go to 1:2 (false): " + king.isMoveValid(1, 2));
    System.out.println("Can King go to 3:5 (false): " + king.isMoveValid(3, 5));
  }

  public static void run() {
    testIfVigureIsMovingCorrectly();
    testIfKingCannotMove();
  }
}
