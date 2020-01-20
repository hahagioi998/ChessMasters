package com.chessmaster.main;

import com.chessmaster.test.BishopTest;
import com.chessmaster.test.KingTest;
import com.chessmaster.test.KnightTest;
import com.chessmaster.test.PawnTest;
import com.chessmaster.test.QueenTest;
import com.chessmaster.test.RookTest;

public class Application {

  public static void main(String[] args) {

    PawnTest.run();
    BishopTest.run();
    RookTest.run();
    KnightTest.run();
    QueenTest.run();
    KingTest.run();
  }
}
