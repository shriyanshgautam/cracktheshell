package com.shriyansh.cracktheshell.algorithms.stringMatching;

public class KMP {


    public static int[] automata(String pattern){
        int[] output = new int[pattern.length()];
        int i=1,j=0;
        output[0]=0;
        while(i<pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                output[i] = j + 1;
                j++;
                i++;
            } else if (j > 0) {
                j = output[j - 1];
            } else {
                output[i] = 0;
                i++;
            }
        }
        return output;
    }


    public static int KMP(String T, String pattern){
        int i=0,j=0;
        int[] automata = automata(pattern);
        while(i<T.length()){
            if(T.charAt(i)==pattern.charAt(j)){
                if(j==pattern.length()-1){
                    return i-j;
                }else {
                    i++;
                    j++;
                }
            }else if(j>0){
                j=automata[j-1];
            }else{
                i++;
            }
        }
        return -1;

    }

    public static void main(String[] args){
        System.out.println(KMPCopy("I am well but good","well"));
    }



























    public static int[] automataCopy(String pattern) {
        int i=0,j=0;
        int [] output = new int[pattern.length()];
        output[i++] = 0;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(j)){
                output[i]=j+1;
                i++;
                j++;
            }else if(j>0){
                j=output[j-1];
            }else{
                output[i]=0;
                i++;
            }
        }
        return output;
    }

    public static int KMPCopy(String T, String pattern){
        int i=0,j=0;
        int[] automata = automataCopy(pattern);
        while(i<T.length()){
            if(T.charAt(i)==pattern.charAt(j)){
                if(j==pattern.length()-1){
                    return i-j;

                }else{
                    i++;
                    j++;
                }
            }else if(j>0){
                j=automata[j-1];
            }else {
                i++;
            }
        }
        return -1;
    }


}
