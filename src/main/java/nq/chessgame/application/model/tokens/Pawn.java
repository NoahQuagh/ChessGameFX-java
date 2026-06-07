package nq.chessgame.application.model.tokens;

import BoardCoordinate.Coordinate;
import nq.chessgame.application.model.Team;
import nq.chessgame.application.model.actions.Move;
import nq.chessgame.application.model.state.Istate;

import java.util.List;

public class Pawn extends Token{
    public Pawn(Team team) {
        super(team);
    }

    @Override
    public String stringRep() {
        return "p";
    }

    @Override
    public Token clone() {
        return new Pawn(team);
    }

    @Override
    public List<Move> getPossibleMoves(Istate state, Coordinate currentPos) {
        return List.of();
    }
}
