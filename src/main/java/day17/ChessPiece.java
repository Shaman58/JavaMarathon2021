package day17;

public enum ChessPiece {
    KING_WHITE("♔", 100),
    QUEEN_WHITE("♕", 9),
    ROOK_WHITE("♖", 5),
    BISHOP_WHITE("♗", 3.5f),
    KNIGHT_WHITE("♘", 3),
    PAWN_WHITE("♙", 1),
    KING_BLACK("♚", 100),
    QUEEN_BLACK("♛", 9),
    ROOK_BLACK("♜", 5),
    BISHOP_BLACK("♝", 3.5f),
    KNIGHT_BLACK("♞", 3),
    PAWN_BLACK("♟", 1),
    EMPTY("_", -1);
    private String string;
    private float price;

    ChessPiece(String string, float price) {
        this.string = string;
        this.price = price;
    }

    public String getString() {
        return string;
    }
}
