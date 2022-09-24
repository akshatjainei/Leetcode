package com.company;

public class LeetConQ2399 {
    public static void main(String[] args) {
        String s = "aba";
        int [] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s , distance));

    }
    static boolean checkDistances(String s, int[] distance) {
        boolean ans = true;
        for (int i = 0; i < s.length()-1; i++) {
            for(int j = 1+i ; j < s.length() ; j++){
                if(s.charAt(i)==s.charAt(j)){
                    int dist = j-i-1;
                    if(distance[(int)s.charAt(i)-97]==dist){
                        ans = true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return ans;
    }
}
