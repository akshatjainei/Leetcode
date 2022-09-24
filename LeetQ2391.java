package com.company;

public class LeetQ2391 {
    public static void main(String[] args) {
        String[] garbage = {"GP","P","G","GG"};
        int [] travel = {2,4,3};
        System.out.println(garbageCollection(garbage,travel));
    }

    static int garbageCollection(String[] garbage, int[] travel) {
        int total=0; int g=0; int p=0; int m=0;
        for(int i=0;i<garbage.length;i++){
            total+=garbage[i].length();
            if(garbage[i].contains("G")) g=i;
            if(garbage[i].contains("P")) p=i;
            if(garbage[i].contains("M")) m=i;
        }
        if(g>0){
            for(int i=0;i<g;i++){
                total = total+travel[i];
            }
        }
        if(p>0){
            for(int i=0;i<p;i++){
                total = total+travel[i];
            }
        }
        if(m>0){
            for(int i=0;i<m;i++){
                total = total+travel[i];
            }
        }
        return total;
    }
}
