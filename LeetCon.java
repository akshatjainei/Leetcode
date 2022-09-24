package com.company;

import java.util.*;

public class LeetCon {
    public static void main(String[] args) {
        int [][] nums = {{5,10},{6,8},{1,5},{2,3},{1,10}};
        int n =5;
        System.out.println(minGroups(nums));
    }
    static boolean minGroups(int[][] arr) {
        Arrays.sort(arr, (a, b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        ArrayList<int[]> ls = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((Math.abs(arr[i][1] - arr[j][0]) == 1 || Math.abs(arr[i][1] - arr[j][0]) == 2)&&(i!=j)){
                    ls.add(arr[i]);
                    ls.add(arr[j]);
                }
            }
        }
        System.out.println(ls);
        return false;
    }
}
