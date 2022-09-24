package com.company;

public class LeetQ2383 {
    public static void main(String[] args) {
        int initialEnergy = 2, initialExperience = 4;
        int [] energy = {1};
        int [] experience = {3};
        System.out.println(minNumberOfHours(initialEnergy,initialExperience,energy,experience));

    }
    static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum =0 , max =0 , index=0;
        for(int i =0 ; i < energy.length ; i++){
            sum+=energy[i];
            max = Math.max(experience[i],max);
        }
        for(int j=0 ; j < energy.length ; j++){
            if(experience[j]==max){
                index=j;
            }
        }
        int c1=(initialEnergy-sum>0)?0:sum-initialEnergy+1;
        sum=0;
        int c2=0;
        if(max>initialExperience){
            for(int k =0 ; k <index ;k++){
                sum+=experience[k];
            }
            c2= max-sum-initialExperience+1;
        }
        return c1+c2;
    }
}
