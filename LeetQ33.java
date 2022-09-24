package com.company;

public class LeetQ33 {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(check(nums,target));
    }
    static int check (int [] nums , int target){
        int pivot = pivots(nums);
        int ans1= search (nums ,target , 0 , pivot-1);
        int ans2 = search (nums,target , pivot , nums.length-1);
        if (ans1!=-1 || ans2!=-1 ){
            return ans1+ans2+1;
        }
        else {
            return -1;
        }
    }
    static int pivots (int [] nums){
        int pivot =0;
        for (int i = 1 ; i <nums.length ; i++){
            if (nums[i-1]>nums[i]){
                pivot = i;
                break;
            }
            else{
                pivot =nums.length-1;
            }
        }
        return pivot;
    }
    static int search (int [] nums , int target , int start , int end){
        while (start<=end){
            int mid = start + (end -start)/2;
            if (nums[mid]>target){
                end = mid-1;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
