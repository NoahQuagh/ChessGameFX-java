package nq.chessgame.application.model.state;

import BoardCoordinate.Coordinate;
import nq.chessgame.application.model.Team;
import nq.chessgame.application.model.actions.Move;
import nq.chessgame.application.model.tokens.Token;

import java.util.Map;
import java.util.Set;

public record State (Map<Coordinate,Token> board,Team turn) implements Istate{

    @Override
    public Istate move(Move move) {
        return null;
    }

    @Override
    public Set<Coordinate> availableMoves(Coordinate from) {
        return Set.of();
    }

    @Override
    public Map<Coordinate, Token> board() {
        return Map.of();
    }

    @Override
    public Team turn() {
        return null;
    }

    @Override
    public Team winner() {
        return null;
    }

    @Override
    public Istate promotionPawn(Coordinate c, Token newToken) {
        return null;
    }

    @Override
    public Istate removeToken(Coordinate c) {
        return null;
    }

    @Override
    public Istate toggleToken(Coordinate position, Team team, Class<?> token) {
        return null;
    }

    @Override
    public boolean isCheck() {
        return false;
    }

    @Override
    public boolean isCheckmate() {
        return false;
    }

    @Override
    public boolean isPat() {
        return false;
    }

    @Override
    public Move getLastMove() {
        return null;
    }

    @Override
    public boolean canCastleLeft(Team team) {
        return false;
    }

    @Override
    public boolean canCastleRight(Team team) {
        return false;
    }

    @Override
    public Set<Move> getLegalMoves() {
        return Set.of();
    }

    public boolean isInField(Coordinate c){
        return board().containsKey(c);
    }
}
