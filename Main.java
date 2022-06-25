package com.company;

public class Main {

    public static void main(String[] args) {
        int [] seats = {4,1,5,9};
        int [] students = {1,3,2,6};
        System.out.println(add(seats, students));
    }
    static int[] sorter ( int [] arr ) {
        for (int i = 0 ; i <arr.length ; i++){
            for (int j = i+1 ; j < arr.length-i ; j++){
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int   add (int [] seats , int []  students ) {
        sorter(seats);
        sorter(students);
        int sum = 0;
        for (int i = 0 ; i< seats.length ; i++){
            sum+=Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
}
