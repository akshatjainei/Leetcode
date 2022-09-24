package com.company;

public class LeetQ941 {
    public static void main(String[] args) {
        int [] nums = {1,3,2};
        System.out.println(check(nums));
    }
    static boolean check (int [] arr){
    int pivot =0;
        for (int i = 1; i <arr.length ; i++){
        if(arr[i-1]>arr[i]){
            pivot = i-1;
            break;
        }
    }
    boolean ans1 = check1(arr,0,pivot);
    boolean ans2 = check2(arr,pivot,arr.length-1);
        return ans1&ans2;

}
    static boolean check1 (int [] arr , int s, int e ){
        boolean a = false;
        for (int i =s+1 ; i <=e ; i++ ){
            if (arr[i-1]<arr[i]){
                a = true;
            }
        }
        return a;
    }
    static boolean check2 (int [] arr , int s, int e ){
        boolean b = false;
        for (int i =s+1 ; i <=e ; i++ ){
            if (arr[i-1]>arr[i]){
                b=true;
            }
        }
        return b;
    }
}
