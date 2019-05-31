package com.shriyansh.cracktheshell.bitManipulation;

public class BitManipulation {

    public static void main(String[] args) {
        BitManipulation bitManipulation = new BitManipulation();
        String res = bitManipulation.insertion("10000000000", "10011", 2, 6);
        System.out.println(res);

        System.out.println(bitManipulation.flipBitToWin("11011101111"));

        System.out.println(bitManipulation.debugger("10001"));

        System.out.println(bitManipulation.conversion("01101", "01111"));


    }

    public int flipBitToWin(String s) {
        int c = getInt(s);
        int count = 0;
        for (int i = 1;i<s.length();i++) {
            int shift = 1 << i;
            if((c & shift) == 0) {
                count ++;
                if (count > 1) {
                    return i;
                }
            }
        }
        return 0;
    }

    public String insertion(String first, String second, int i, int j) {
        int a = getInt(first);
        int b = getInt(second);
        b = (b<<i);
        a = a | b;
        return getBinaryString(a);
    }

    public boolean debugger(String s) {
        int a = getInt(s);
        return ((a & (a-1)) == 0);
    }

    public int conversion(String first, String second) {
        int a = getInt(first);
        int b = getInt(second);
        int res = a ^ b;
        int count = 0;
        for (int i=1; i<first.length();i++) {
            int shift = 1<<i;
            if ((res & shift) != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Works only for positive.
     * @param s
     * @return
     */
    private static Integer getInt(String s) {
        return Integer.parseInt(s, 2);
    }

    private static String getBinaryString(Integer i) {
        return Integer.toBinaryString(i);
    }




}
