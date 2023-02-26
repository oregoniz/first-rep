package Chess;

public class Horse extends ChessPiece implements isRight {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return Horse.this.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (isInTheField(toLine, toColumn)&& isRightMove(line,column,toLine,toColumn))
        {return true;}
        else return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    @Override
    public boolean isRightMove(int line, int column, int toLine, int toColumn) {
        boolean is = false;
        if (Math.abs(line - toLine) == 2) {
            if (Math.abs(column - toColumn) == 1) is= true;
        }
        if (Math.abs(column - toColumn) == 2) {
            if (Math.abs(line - toLine) == 1) is = true;
        }
        return is;
    }
}

interface isRight {
    default boolean isInTheField(int line, int column) {
        if (line >= 0 && line <= 7 && column >= 0 && column <= 7) return true;
        else return false;
    }
    boolean isRightMove(int line, int column, int toLine, int toColumn);
}
