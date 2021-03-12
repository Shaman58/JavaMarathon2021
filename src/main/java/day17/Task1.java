package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chessPieces = new ArrayList<>();
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        for(ChessPiece chessPiece: chessPieces)
            System.out.print(chessPiece.getString() + " ");
    }
}