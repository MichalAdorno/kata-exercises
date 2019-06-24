package com.myself.misc.floodfill;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point west() {
        return new Point(this.x - 1, this.y);
    }

    public Point north() {
        return new Point(this.x, this.y + 1);
    }

    public Point east() {
        return new Point(this.x + 1, this.y);
    }

    public Point south() {
        return new Point(this.x, this.y - 1);
    }

}
