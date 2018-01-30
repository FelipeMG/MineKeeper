import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CellTest {

    @Test
    public void initialCellIsNotVisible(){
        assertThat(Cell.of().boardCell().equals(Constants.INVISIBLE_CELL), is(true) );
    }

    @Test
    public void initialCellIsVisibleAfter(){
        Cell visibleCell = Cell.of();
        visibleCell.setVisible(true);
        assertThat(visibleCell.boardCell().equals(Constants.INVISIBLE_CELL), is(false) );
    }

    @Test
    public void initialCellVisibleHasZeroMines(){
        Cell visibleCell = Cell.of();
        visibleCell.setVisible(true);
        assertThat(visibleCell.boardCell().equals(" 0 "), is(true) );
    }

    @Test
    public void initialCellVisibleHasSevenMines(){
        Cell visibleCell = Cell.of();
        visibleCell.setVisible(true);
        visibleCell.setAdjacentMines(7);
        assertThat(visibleCell.boardCell().equals(" 7 "), is(true) );
    }

    @Test
    public void minedVisibleCellHasAsteriskSign(){
        Cell visibleCell = Cell.of();
        visibleCell.setVisible(true);
        visibleCell.setMined(true);
        assertThat(visibleCell.boardCell().equals(Constants.MINED_CELL), is(true) );
    }

    @Test
    public void minedInvisibleCellHasMinusSign(){
        Cell visibleCell = Cell.of();
        visibleCell.setMined(true);
        assertThat(visibleCell.boardCell().equals(Constants.INVISIBLE_CELL), is(true) );
    }

    @Test
    public void flaggedCellHasGreaterThanSign(){
        Cell visibleCell = Cell.of();
        visibleCell.setFlagged(true);
        assertThat(visibleCell.boardCell().equals(Constants.FLAGGED_CELL), is(true) );
    }

    @Test
    public void markedCellHasGreaterThanSign(){
        Cell visibleCell = Cell.of();
        visibleCell.setMarked(true);
        assertThat(visibleCell.boardCell().equals(Constants.MARKED_CELL), is(true) );
    }

}
