package com.company;

import java.util.ArrayList;

public class LeetQ1823 {
    public static void main(String[] args) {
        int n =5;
        int k =2;
        System.out.println(findTheWinner(n, k));
    }
    static int findTheWinner(int n, int k) {
        ArrayList<Integer> ls = new ArrayList <Integer> ();
        for(int i=1 ; i <= n ; i++){
            ls.add(i);
        }
        int index = -1;
        do{
            index+=k;
            if(index>ls.size()){
                index=ls.size()%k;
            }
            ls.remove(index);
        }
        while(ls.size()>1);
        return ls.get(0);
    }
}
