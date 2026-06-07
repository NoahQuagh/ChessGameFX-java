package BoardCoordinate;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class Coordinate {

    public Coordinate toDir(@NotNull Direction direction) {
        return switch (direction) {
            case NO -> NO();
            case N -> N();
            case NE -> NE();
            case E -> E();
            case SE -> SE();
            case S -> S();
            case SO -> SO();
            case O -> O();
            default -> throw new RuntimeException("Undefined direction");
        };
    }

    public abstract Coordinate N();
    public abstract Coordinate NE();
    public abstract Coordinate E();
    public abstract Coordinate SE();
    public abstract Coordinate S();
    public abstract Coordinate SO();
    public abstract Coordinate O();
    public abstract Coordinate NO();

    public abstract List<Coordinate> between(Coordinate to);
}
