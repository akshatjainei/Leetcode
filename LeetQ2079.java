package com.company;

public class LeetQ2079 {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3};
        System.out.println(wateringPlants(arr,5));
    }
    static int wateringPlants(int[] plants, int capacity) {
        int count =0 , s =capacity;
        for(int i =0 ; i < plants.length ; i++){
            if(s-plants[i]>0){
                s=capacity-plants[i];
                count++;
            }
            else{
                count+=2*i+1;
                s=capacity;
            }
        }
        return count;
    }
}
