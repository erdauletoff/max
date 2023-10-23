package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int res = values[0];

        for (int value : values) {
            res = Math.max(value, res);
        }
        return res;
    }
}
