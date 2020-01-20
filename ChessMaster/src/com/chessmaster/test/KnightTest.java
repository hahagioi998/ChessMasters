package com.chessmaster.test;

import com.chessmaster.pieces.Knight;

public class KnightTest {
  private static Knight knight = new Knight("WHITE", 1, 2);

  public static void testIfVigureIsMovingCorrectly() {
    System.out.println("Test if knight is moving correctly");

    System.out.println("Can Knight go to 3:1 (true): " + knight.isMoveValid(3, 1));

    System.out.println("Can Knight go to 3:3 (true): " + knight.isMoveValid(3, 3));
    System.out.println("Can Knight go to 3:3 (true): " + knight.isMoveValid(2, 4));
  }

  public static void testIfQueenCannotMove() {
    System.out.println("Can Knight go to 3:5 (false): " + knight.isMoveValid(3, 5));
    System.out.println("Can Knight go to 5:6 (false): " + knight.isMoveValid(5, 6));
  }

  public static void run() {
    testIfVigureIsMovingCorrectly();
    testIfQueenCannotMove();
  }
}
