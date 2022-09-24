package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Dev_to_Rev {
    public static void main(String[] args) {
        String s = "dfa123291afd";
        char[] c = s.toCharArray();
        ArrayList <Character> ls = new ArrayList<>();
        for (char value : c) {
            if (value <= 58) ls.add(value);
        }
        Collections.sort(ls);
        HashSet list = new HashSet(ls);
   }
}
