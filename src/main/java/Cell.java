public class Cell {

    private boolean isVisible;
    private boolean isMined;
    private boolean isFlagged;
    private boolean isMarked;
    private int adjacentMines;

    private Cell(boolean isVisible, boolean isMined, boolean isFlagged, boolean isMarked, int adjacentMines) {
        this.isVisible = isVisible;
        this.isMined = isMined;
        this.isFlagged = isFlagged;
        this.isMarked = isMarked;
        this.adjacentMines = adjacentMines;
    }

    public static Cell of(){
        return new Cell(false,false,false,false,0);
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public void setMined(boolean mined) {
        isMined = mined;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    public void setMarked(boolean marked) {
        isMarked = marked;
    }

    public void setAdjacentMines(int adjacentMines) {
        this.adjacentMines = adjacentMines;
    }

    public String boardCell(){
        if(isFlagged){
            return Constants.FLAGGED_CELL;
        }
        else if(isMarked){
            return Constants.MARKED_CELL;
        }
        else if(!isVisible){
            return Constants.INVISIBLE_CELL;
        }
        else{
            if(isMined){
                return Constants.MINED_CELL;
            }
            else{
                return " " + adjacentMines + " ";
            }
        }
    }

    @Override
    public String toString() {
        return "Cell{" +
                "isVisible=" + isVisible +
                ", isMined=" + isMined +
                ", isFlagged=" + isFlagged +
                ", isMarked=" + isMarked +
                ", adjacentMines=" + adjacentMines +
                '}';
    }
}
