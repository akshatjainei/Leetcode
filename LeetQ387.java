package com.company;

public class LeetQ387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
    static int firstUniqChar(String s) {
        int k =0;
        for(int i =0 ; i < s.length() ; i++){
            for(int j =0 ; j < s.length() ; j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    break;
                }
                else{
                    k++;
                }
            }
            if(k==s.length()){
                return i;
            }
            else{
                k=0;
            }
        }
        return -1;
    }
}
