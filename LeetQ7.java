package com.company;

public class LeetQ7 {
    public static void main(String[] args) {
        int num = -123;
        System.out.println(reverse(num));
    }
    static int reverse(int x) {
        StringBuilder sb = new StringBuilder ();
        sb.append(Integer.toString(x));
        sb.reverse();
        boolean flag = false;
        if(sb.charAt(sb.length()-1)=='-'){
            sb.deleteCharAt(sb.length()-1);
            flag = true;
        }
        String ans = sb.toString();
        return (flag)? Integer.parseInt(ans)*-1 : Integer.parseInt(ans);
    }
}
