package com.company;

import java.util.Arrays;

public class LeetQ833 {
    public static void main(String[] args) {
        int [] ind = {0,2,1,5};
        String [] source = {"a", "cd"};
        String [] target = {"eee", "ffff"};
        System.out.println(findReplaceString("abcd", ind , source ,target));
    }
    static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder sb = new StringBuilder();
        int [] clone = sort(indices);
        sb.append(s);
            for (int j = 0; j < indices.length; j++) {
                String str = s.substring(indices[j]);
                if (str.startsWith(sources[j])) {
                    sb.delete(indices[j],indices[j]+sources.length-1);
                }
            }
            return sb.toString();
    }
    static int [] sort(int [] ind){
        for (int i = 0; i < ind.length-1; i++) {
            for (int j = 0; j < ind.length-i-1; j++) {
                if(ind[j]>ind[j+1]){
                    int temp = ind[j];
                    ind[j]= ind [j+1];
                    ind [j+1]= temp;
                }
            }
        }
        return ind;
    }
}
