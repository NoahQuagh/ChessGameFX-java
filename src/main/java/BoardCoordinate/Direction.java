package BoardCoordinate;

public enum Direction {
    N,NE,E,SE,S,SO,O,NO;

    public Direction opposite() {
        return Direction.values()[(this.ordinal() + 4) % 8];
    }
}
