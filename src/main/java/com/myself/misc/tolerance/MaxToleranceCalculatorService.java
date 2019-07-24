package com.myself.misc.tolerance;

import java.util.List;

import static java.util.Objects.isNull;

public class MaxToleranceCalculatorService {

    public int maxSegmentLengthWithinTolerance(final List<Integer> values, final int tolerance) {
        if (isNull(values) || values.isEmpty()) {
            return 0;
        }
        int n = values.size() - 1;
        int i = 0;
        int recordLength = 1;

        while (i <= n - recordLength) {
            int j = i + 1;
            int min = values.get(i);
            int max = values.get(i);
            boolean stableWithinTolerance = true;
            while (j <= n && stableWithinTolerance) {
                if (values.get(j) > max) {
                    max = values.get(j);
                } else if (values.get(j) < min) {
                    min = values.get(j);
                }

                if (max - min > tolerance) {
                    stableWithinTolerance = false;
                } else {
                    j++;
                }
            }
            if (j - i > recordLength) {
                recordLength = j - i;
            }
            i++;
        }

        return recordLength;
    }

}
