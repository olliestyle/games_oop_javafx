package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LogicTest {

    @Test
    public void whenAnotherFigureOnTheWay() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        Figure pawn = new PawnBlack(Cell.D2);
        logic.add(bishop);
        logic.add(pawn);
        logic.move(Cell.C1,Cell.G5);
        assertThat(bishop.position(), is(Cell.C1));
    }

}
