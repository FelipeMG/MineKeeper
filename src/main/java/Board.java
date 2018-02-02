public class Board {

    private Cell[][] cells;
    private int secondsLeft;
    private int minesLeft;
    private boolean hasWon;

    private Board(int size, int mines){
        this.minesLeft = mines;
        this.hasWon = false;
        this.cells = cellInitializer(size);
    }

    public static Board of(int size, int mines){
        return new Board(size,mines);
    }

    private Cell[][] cellInitializer(int size){
        Cell[][] myBoard = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                myBoard[i][j] = Cell.of();
            }
        }
        return myBoard;
    }

    public String printBoard(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                builder.append(this.cells[i][j].boardCell());
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
