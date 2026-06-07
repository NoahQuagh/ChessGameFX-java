package BoardCoordinate;

import java.util.ArrayList;
import java.util.List;

public class CoordinateDoubled extends Coordinate{

    private int x;
    private int y;

    public CoordinateDoubled(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Coordinate N() {
        return new CoordinateDoubled(x,y+1);
    }

    @Override
    public Coordinate NE() {
        return new CoordinateDoubled(x+1,y+1);
    }

    @Override
    public Coordinate E() {
        return new CoordinateDoubled(x+1,y);
    }

    @Override
    public Coordinate SE() {
        return new CoordinateDoubled(x+1,y-1);
    }

    @Override
    public Coordinate S() {
        return new CoordinateDoubled(x,y-1);
    }

    @Override
    public Coordinate SO() {
        return new CoordinateDoubled(x-1,y-1);
    }

    @Override
    public Coordinate O() {
        return new CoordinateDoubled(x-1,y);
    }

    @Override
    public Coordinate NO() {
        return new CoordinateDoubled(x-1,y+1);
    }

    @Override
    public List<Coordinate> between(Coordinate to) {
        List<Coordinate> coordinatesBetween = new ArrayList<>();

        if (!(to instanceof CoordinateDoubled)) {
            throw new IllegalArgumentException("Systeme de coordonnées incompatible");
        }
        CoordinateDoubled target = (CoordinateDoubled) to;

        int dx = target.x - this.x;
        int dy = target.y - this.y;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        if (steps <= 1) {
            return coordinatesBetween;
        }

        for (int i = 1; i < steps; i++) {
            double t = (double) i / steps;

            int interpolatedX = (int) Math.round(this.x + t * dx);
            int interpolatedY = (int) Math.round(this.y + t * dy);

            coordinatesBetween.add(new CoordinateDoubled(interpolatedX, interpolatedY));
        }

        return coordinatesBetween;
    }
}
