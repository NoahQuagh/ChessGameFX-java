package nq.chessgame.application.model.tokens;

import BoardCoordinate.Coordinate;
import nq.chessgame.application.model.Team;
import nq.chessgame.application.model.actions.Move;
import nq.chessgame.application.model.state.Istate;

import java.util.List;

public class Queen extends Token{
    public Queen(Team team) {
        super(team);
    }

    @Override
    public String stringRep() {
        return "Q";
    }

    @Override
    public Token clone() {
        return new Queen(team);
    }

    @Override
    public List<Move> getPossibleMoves(Istate state, Coordinate currentPos) {
        return List.of();
    }
}
