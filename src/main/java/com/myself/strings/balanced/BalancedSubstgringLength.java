package com.myself.strings.balanced;

import java.util.HashSet;
import java.util.Set;

public class BalancedSubstgringLength {

    /*
        Memory: O(N)
        Time: O(N²)
     */
    public int maxBalancedSubstringLength1(final String str) {
        if (str == null || str.length() <= 1) {
            return -1;
        }
        int i = 0;
        int maxBalancedLength = -1;
        int N = str.length();

        while (i < N) {
            int j = i+1;
            int currentBalancedLength = -1;
            final Set<Character> accumulator = new HashSet<>();
            accumulator.add(str.charAt(i));
            while (j < N) {
                accumulator.add(str.charAt(j));
                if (j - i > 1) {
                    if (isBalanced(accumulator)){
                        currentBalancedLength = j - i + 1;
                    }
                }
                j++;
            }
            maxBalancedLength = currentBalancedLength > 0
                    ? Math.max(currentBalancedLength, maxBalancedLength)
                    : maxBalancedLength;

            i++;
        }
        return maxBalancedLength;
    }

    private static boolean isBalanced(final Set<Character> accumulator) {
        return accumulator.stream()
                .filter(ch->!accumulator.contains(Character.toLowerCase(ch))
                        || !accumulator.contains(Character.toUpperCase(ch)))
                .count() == 0;
    }

    public static void main(String[] args) {
        var set = new HashSet<Character>();
        set.add('A');
        set.add('a');
        set.add('Z');
        set.add('z');
        set.add('S');
        System.out.println(set);
        System.out.println(isBalanced(set));
    }

}
