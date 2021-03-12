package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard;
//        ChessPiece[][] chessPieces = new ChessPiece[8][8];
//        for (int i = 0; i < chessPieces.length; i++)
//            Arrays.fill(chessPieces[i], ChessPiece.EMPTY);
//        chessPieces[0][0] = ChessPiece.ROOK_BLACK;
//        chessPieces[0][5] = ChessPiece.ROOK_BLACK;
//        chessPieces[0][6] = ChessPiece.KING_BLACK;
//        chessPieces[1][1] = ChessPiece.ROOK_WHITE;
//        chessPieces[1][4] = ChessPiece.PAWN_BLACK;
//        chessPieces[1][5] = ChessPiece.PAWN_BLACK;
//        chessPieces[1][7] = ChessPiece.PAWN_BLACK;
//        chessPieces[2][0] = ChessPiece.PAWN_BLACK;
//        chessPieces[2][2] = ChessPiece.KNIGHT_BLACK;
//        chessPieces[2][6] = ChessPiece.PAWN_BLACK;
//        chessPieces[3][0] = ChessPiece.QUEEN_BLACK;
//        chessPieces[3][3] = ChessPiece.BISHOP_WHITE;
//        chessPieces[4][3] = ChessPiece.BISHOP_BLACK;
//        chessPieces[4][4] = ChessPiece.PAWN_WHITE;
//        chessPieces[5][4] = ChessPiece.BISHOP_WHITE;
//        chessPieces[5][5] = ChessPiece.PAWN_WHITE;
//        chessPieces[6][0] = ChessPiece.PAWN_WHITE;
//        chessPieces[6][3] = ChessPiece.QUEEN_WHITE;
//        chessPieces[6][5] = ChessPiece.PAWN_WHITE;
//        chessPieces[6][7] = ChessPiece.PAWN_WHITE;
//        chessPieces[7][5] = ChessPiece.ROOK_WHITE;
//        chessPieces[7][6] = ChessPiece.KING_WHITE;

        chessBoard = new ChessBoard(scanFromTxt(new File("chess")));
        chessBoard.print();
    }

    public static ChessPiece[][] scanFromTxt(File file) {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        for (int i = 0; i < chessPieces.length; i++)
            Arrays.fill(chessPieces[i], ChessPiece.EMPTY);
        try {
            Scanner scanner = new Scanner(file);
            int i = 0;
            while (scanner.hasNext()) {
                String[] str = scanner.nextLine().split("");
                for (int j = 0; j < str.length; j++) {
                    switch (str[j]) {
                        case "♙":
                            chessPieces[i][j] = ChessPiece.PAWN_WHITE;
                            break;
                        case "♘":
                            chessPieces[i][j] = ChessPiece.KNIGHT_WHITE;
                            break;
                        case "♗":
                            chessPieces[i][j] = ChessPiece.BISHOP_WHITE;
                            break;
                        case "♖":
                            chessPieces[i][j] = ChessPiece.ROOK_WHITE;
                            break;
                        case "♕":
                            chessPieces[i][j] = ChessPiece.QUEEN_WHITE;
                            break;
                        case "♔":
                            chessPieces[i][j] = ChessPiece.KING_WHITE;
                            break;
                        case "♟":
                            chessPieces[i][j] = ChessPiece.PAWN_BLACK;
                            break;
                        case "♞":
                            chessPieces[i][j] = ChessPiece.KNIGHT_BLACK;
                            break;
                        case "♝":
                            chessPieces[i][j] = ChessPiece.BISHOP_BLACK;
                            break;
                        case "♜":
                            chessPieces[i][j] = ChessPiece.ROOK_BLACK;
                            break;
                        case "♛":
                            chessPieces[i][j] = ChessPiece.QUEEN_BLACK;
                            break;
                        case "♚":
                            chessPieces[i][j] = ChessPiece.KING_BLACK;
                            break;
                        default:
                            chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return chessPieces;
    }
}
