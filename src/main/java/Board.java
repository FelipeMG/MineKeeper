public class Board {

    private Cell[][] cells;
    private int secondsLeft;
    private int minesLeft;
    private boolean hasWon;

    public void print(){
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                this.cells[i][j].boardCell();
            }
        }
    }
}
