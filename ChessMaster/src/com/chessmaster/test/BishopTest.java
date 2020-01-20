package com.chessmaster.test;

import com.chessmaster.pieces.Bishop;

public class BishopTest {
  private static Bishop bishop = new Bishop("WHITE", 1, 3);

  public static void testIfVigureIsMovingCorrectly() {
    System.out.println("Test if bishop is moving correctly");

    System.out.println("Can Bishop go to 2:2 (true): " + bishop.isMoveValid(2, 2));

    System.out.println("Can Bishop go to 4:6 (true): " + bishop.isMoveValid(4, 6));
  }

  public static void testIfRookCannotMove() {
    System.out.println("Can Bishop go to 1:2 (false): " + bishop.isMoveValid(1, 2));
    System.out.println("Can Bishop go to 4:5 (false): " + bishop.isMoveValid(1, 2));
  }

  public static void run() {
    testIfVigureIsMovingCorrectly();
    testIfRookCannotMove();
  }
}
