package com.myself.misc.floodfill;

import java.util.Deque;
import java.util.LinkedList;

public class Flood {

    public Area fillWithWater(Area area, Point start, int watermark) {

        Deque<Point> toBeFlooded = initializeToBeFlooded(start);
        int initialState = getInitialState(area, start);
        while (!toBeFlooded.isEmpty()) {
            Point current = toBeFlooded.removeFirst();
            flood(area, current, watermark);
            markAdjacentsForFlooding(area, toBeFlooded, current, watermark, initialState);
        }

        return area;
    }

    private int getInitialState(Area area, Point start) {
        return area.get(start);
    }

    private void markAdjacentsForFlooding(Area area,
                                          Deque<Point> toBeFlooded,
                                          Point current,
                                          int watermark,
                                          int initialState) {
        Deque<Point> adjacents = new LinkedList<>();

        adjacents.add(current.west());
        adjacents.add(current.north());
        adjacents.add(current.east());
        adjacents.add(current.south());

        adjacents.stream()
                .filter(point -> point.x >= 0 && point.y >= 0)
                .filter(point -> point.x < area.getSizeX() && point.y < area.getSizeY())
                .filter(point -> area.get(point) <= watermark)
                .filter(point -> area.get(point) == initialState)
                .forEach(toBeFlooded::addFirst);
    }

    private void flood(Area area, Point current, int floodValue) {
        area.set(current, floodValue);
    }

    private Deque<Point> initializeToBeFlooded(Point start) {
        Deque<Point> toBeFloodedInitially = new LinkedList<>();
        toBeFloodedInitially.add(start);
        return toBeFloodedInitially;
    }

}
