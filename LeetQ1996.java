package com.company;

import java.util.Arrays;

public class LeetQ1996 {
    public static void main(String[] args) {
        int [][] arr = {{5,5},{6,4},{3,6},{5,3}};
        System.out.println(numberOfWeakCharacters(arr));
    }
    static int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

//        int count =0;
//        int [] arr = new int [properties.length];
//        for(int i =0; i < properties.length ;i++){
//            for(int j =0; j < properties.length ; j++){
//                if(properties[i][0]>properties[j][0]&&properties[i][1]>properties[j][1]&&arr[j]!=1){
//                    arr[j]=1;
//                }
//            }
//        }
//        for(int i =0 ; i < arr.length ; i++){
//            if(arr[i]==1){
//                count++;
//            }
//        }
//        return count;
        int len = properties.length , count =0;
        int max = properties[len-1][1];
        for (int i = len-2; i >=0; i--) {
            if(properties[i][1]<max){
                count++;
            }
            else{
                max=properties[i][1];
            }
        }
        return count;
    }
}
