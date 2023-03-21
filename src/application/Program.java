package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    ChessMatch chessMatch = new ChessMatch();

    while (true) {
      UI.printBoard(ChessMatch.getpieces());
      System.out.println();
      System.out.print("Source: ");
      ChessPosition source = UI.reaChessPosition(sc);

      System.out.println();
      System.out.print("Target: ");
      ChessPosition target = UI.reaChessPosition(sc);

      ChessPiece capturedPiece = chessMatch.preformChessMove(source, target);
    }



  }
}
