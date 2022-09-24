package com.company;

public class LeetQ1009 {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(7));

    }
    static int bitwiseComplement(int n) {
        int ans =0;
        StringBuilder sb = new StringBuilder ();
        sb.append(Integer.toBinaryString(n));
        for (int i = 0; i < sb.length() ; i++) {
            if(sb.charAt(i)=='1') sb.replace(i,i,"0");
            else sb.replace(i,i,"1");
        }
        String rev = sb.toString();
        int k =0;
        for(int i =rev.length()-1 ; i >=0 ; i--){
            if(rev.charAt(i)=='1'){
                ans+=Math.pow(2,k);
                k++;
            }
            else k++;
        }
        return ans;
    }
}
