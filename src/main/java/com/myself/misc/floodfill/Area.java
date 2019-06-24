package com.myself.misc.floodfill;

public class Area {

    public Area(Integer[][] internalArea) {
        this.internalArea = internalArea;
    }

    private Integer[][] internalArea;

    public void print() {
        int nColumns = internalArea.length;
        int nRows = internalArea[0].length;
        for (int col = 0; col < nColumns; col++) {
            for (int row = 0; row < nRows; row++) {
                System.out.printf("[-%s-]", internalArea[col][row]);
            }
            System.out.println("");
        }

    }

    public int get(Point point) {
        return internalArea[point.x][point.y];
    }

    public void set(Point point, int value) {
        internalArea[point.x][point.y] = value;
    }


    public int getSizeX() {
        return internalArea.length;
    }

    public int getSizeY() {
        return internalArea[0].length;
    }
}
