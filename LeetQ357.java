package com.company;

import java.util.Arrays;

public class LeetQ357 {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(2));
    }
    static int countNumbersWithUniqueDigits(int n) {
        int count =0;
        for(int i =0 ;i<Math.pow(10,n) ; i++){
            String a = Integer.toString(i);
            char [] c = a.toCharArray();
            Arrays.sort(c);
            StringBuilder sb = new StringBuilder ();
            for(int k =0 ; k <c.length ;k++){
                sb.append(c[k]);
            }
            String d = sb.toString();
            for(int j =1 ; j < d.length() ; j++){
                if(a.charAt(j)==d.charAt(j-1)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
