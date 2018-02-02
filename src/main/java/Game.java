public class Game {

    public static void main(String args[]){

        Board myBoard = Board.of(Constants.BOARD_SIZE,Constants.NUMBER_OF_MINES);
        System.out.println(myBoard.printBoard());

    }
}
