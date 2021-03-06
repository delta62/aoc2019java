package com.samnoedel.aoc2019.cartesian;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class Span {
    private final Point from;
    private final Point to;

    public Span(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    public Span(Point relativeTo, @NotNull Vector vector) {
        from = relativeTo;
        int toX, toY;
        switch (vector.getDir()) {
            case Up:
                toX = from.x;
                toY = from.y + vector.getLen();
                break;
            case Down:
                toX = from.x;
                toY = from.y - vector.getLen();
                break;
            case Left:
                toX = from.x - vector.getLen();
                toY = from.y;
                break;
            case Right:
                toX = from.x + vector.getLen();
                toY = from.y;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + vector.getDir());
        }
        to = new Point(toX, toY);
    }

    public Point getTo() {
        return to;
    }

    public boolean isVertical() {
        return this.from.x == this.to.x;
    }

    public Optional<Point> findIntersectionWith(Span other) {
        if (isVertical()) {
            // this is vertical; other must be horizontal
            boolean intersectsX = Math.min(other.from.x, other.to.x) <= from.x && Math.max(other.from.x, other.to.x) >= from.x;
            boolean intersectsY = Math.min(from.y, to.y) <= other.from.y && Math.max(from.y, to.y) >= other.from.y;
            if (intersectsX && intersectsY) {
                return Optional.of(new Point(other.from.x, from.y));
            } else {
                return Optional.empty();
            }
        } else {
            // this is horizontal; other must be vertical
            boolean intersectsX = Math.min(from.x, to.x) <= other.from.x && Math.max(from.x, to.x) >= other.from.x;
            boolean intersectsY = Math.min(other.from.y, other.to.y) <= from.y && Math.max(other.from.y, other.to.y) >= from.y;
            if (intersectsX && intersectsY) {
                return Optional.of(new Point(other.from.x, from.y));
            } else {
                return Optional.empty();
            }
        }
    }
}
