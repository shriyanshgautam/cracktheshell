package com.shriyansh.cracktheshell.algorithms.dynamicProgramming;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();
        Long length = subsequence.getLongestSequence(new Long[]{3L,4L,-1L,0L,6L,2L,3L});
        System.out.println("LIS " + length);
    }

    public Long getLongestSequence(Long[] s) {
        /*
         * Base case.
         */
        if (s == null || s.length == 0) return 0L;

        // Initialization of array
        Long[] result = initLengths(s.length);

        /*
         * Core algorithm
         */
        for (int i=1;i<s.length;i++) {
            for (int j=0;j<i;j++) {
                if (s[j] < s[i]) {
                    result[i] = Math.max(result[i], result[j] + 1);
                }
            }
        }

        /*
         * Result.
         */
        return findMax(result);
    }

    private Long[] initLengths(int length) {
        Long[] result = new Long[length];
        for (int i = 0; i< length; i++) {
            result[i] = 1L;
        }
        return result;
    }

    private Long findMax(Long[] result) {
        Long max = Long.MIN_VALUE;
        for (Long aResult : result) {
            if (aResult > max) {
                max = aResult;
            }
        }
        ArrayList<Long> list = new ArrayList<>();
        return max;
    }
}
