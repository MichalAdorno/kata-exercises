package com.myself.misc.find3;

import java.util.List;

public class MonothonicTroikaFinder {
    public Troika findIncreasingTroika(final List<Integer> nums) {
        if (nums == null || nums.size() < 3) {
            return null;
        }

        int i = 1;
        int n = nums.size() - 1;
        Integer a = nums.get(0);
        int xRes = nums.get(0);
        Integer b = null;
        while (i <= n) {
            Integer current = nums.get(i);
            if (haveExactlyOne(a, b)) {
                if (a < current) {
                    b = current;
                    xRes = Math.min(xRes, current);
                } else {
                    if (xRes < current) {
                        a = xRes;
                        b = current;
                    } else {
                        xRes = current;
                    }
                }

            } else if (haveExactlyTwo(a, b)) {
                if (b < current) {
                    return new Troika(a, b, current);
                }
                if (current < xRes) {
                    xRes = current;
                    if (a < xRes) {
                        b = xRes;
                    }
                } else {
                    a = xRes;
                    b = current;
                }
            }
            i++;
        }
        return null;
    }

    private boolean haveExactlyOne(Integer a, Integer b) {
        return a != null
                && b == null;
    }

    private boolean haveExactlyTwo(Integer a, Integer b) {
        return a != null
                && b != null;
    }

}

