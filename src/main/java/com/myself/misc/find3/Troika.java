package com.myself.misc.find3;

public class Troika {
    public int x;
    public int y;
    public int z;

    public Troika(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("Troika{%s,%s,%s}", x, y, z);
    }
}
