package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetQ1898 {
    public static void main(String[] args) {
        int [] arr = {3,1,0};
        System.out.println(maximumRemovals("abcab","ab",arr));
    }
    public static String removeChar(String str , int p){
        return str.substring(0,p)+str.substring(p+1);
    }
    static int maximumRemovals(String s, String p, int[] removable) {
        String edit = s , s1 = s;
        int count =0;
        for (int i = 0; i < removable.length ; i++) {
            edit = removeChar(s1,removable[i]);
            if(!search(edit,p)){
                break;
            }
            s1=edit;
            count++;
        }
        return count;
    }
    static boolean search (String edit , String p){
        char [] edited = edit.toCharArray();
        Arrays.sort(edited);
        char [] seq = p.toCharArray();
        int count =0;
        int start = 0;
        int end = edited.length;
        for (int i = 0; i < seq.length ; i++) {
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (edited[mid] > seq[i]) {
                    end = mid - 1;
                } else if (edited[mid] < seq[i]) {
                    start = mid + 1;
                } else {
                    count++;
                }
            }
        }
        return count == seq.length;
    }
}
