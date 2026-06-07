package nq.chessgame.application.model.state;

import BoardCoordinate.Coordinate;
import nq.chessgame.application.model.Team;
import nq.chessgame.application.model.actions.Move;
import nq.chessgame.application.model.tokens.Token;

import java.util.Map;
import java.util.Set;

public interface Istate {
    public Istate move(Move move);
    public Set<Coordinate> availableMoves(Coordinate from);
    public Map<Coordinate,Token> board();
    public Team turn();
    public Team winner();
    public Istate promotionPawn(Coordinate c,Token newToken);
    public Istate removeToken(Coordinate c);
    public Istate toggleToken(Coordinate position,Team team,Class<?> token);
    public boolean isCheck();
    public boolean isCheckmate();
    public boolean isPat();
    public Move getLastMove();
    public boolean canCastleLeft(Team team);
    public boolean canCastleRight(Team team);
    public Set<Move> getLegalMoves();//vide+check est vrai -> echec et mat *** vide+check et faux -> pat
}
