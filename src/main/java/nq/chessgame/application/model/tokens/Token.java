package nq.chessgame.application.model.tokens;

import BoardCoordinate.Coordinate;
import nq.chessgame.application.model.Team;
import nq.chessgame.application.model.actions.Move;
import nq.chessgame.application.model.state.Istate;

import java.util.List;

public abstract class Token {
    protected Team team;

    public Token(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public abstract String stringRep();
    public abstract Token clone();
    public abstract List<Move> getPossibleMoves(Istate state, Coordinate currentPos);
}
