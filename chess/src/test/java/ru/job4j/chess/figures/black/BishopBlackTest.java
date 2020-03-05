package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void whenSameCell() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell expected = bishopBlack.position();
        assertThat(expected, is(Cell.C8));
    }

    @Test
    public void whenCorrectCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        BishopBlack expectedBishopBlack = (BishopBlack) bishopBlack.copy(Cell.F5);
        Cell expectedCell = expectedBishopBlack.position();
        assertThat(expectedCell, is(Cell.F5));
    }

    @Test
    public void whenWayIsCorrect1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.C1, Cell.G5);
        assertThat(way, is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void whenWayIsCorrect2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] way = bishopBlack.way(Cell.G5, Cell.C1);
        assertThat(way, is(new Cell[]{Cell.F4, Cell.E3, Cell.D2, Cell.C1}));
    }

    @Test
    public void whenWayIsCorrect3() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F1);
        Cell[] way = bishopBlack.way(Cell.F1, Cell.C4);
        assertThat(way, is(new Cell[]{Cell.E2, Cell.D3, Cell.C4}));
    }

    @Test
    public void whenWayIsCorrect4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C4);
        Cell[] way = bishopBlack.way(Cell.C4, Cell.F1);
        assertThat(way, is(new Cell[]{Cell.D3, Cell.E2, Cell.F1}));
    }

}
