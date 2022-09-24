package com.company;

public class LeetQ848 {
    public static void main(String[] args) {
        int[] s = {3,5,9};
        System.out.println(shiftingLetters("abc",s));
    }
    static String shiftingLetters(String s, int[] shifts) {
        for(int i =0 ; i < shifts.length ; i++){
            if(shifts[i]>26) shifts[i]%=26;
        }
        char[] c = s.toCharArray();
        int k =0;
            for (int j = 0; j <= k; j++) {
                if ((int) c[j] + shifts[k] <= 122) {
                    c[j] += shifts[k];
                } else {
                    c[j] += shifts[k]-26;
                }
                if(j==s.length()-1) break;
                if(j==k) {
                    k++;
                    j = -1;
                }
            }

        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < c.length ;i++){
            sb.append(c[i]);
        }
        return sb.toString();
    }
}
