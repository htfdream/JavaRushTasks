package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] s = getTokens("level22.lesson13.task01", ".");
        //System.out.println(getTokens("level22.lesson13.task01", "."));
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    public static String [] getTokens(String query, String delimiter) {
        List<String> array = new ArrayList<String>();
        StringTokenizer token = new StringTokenizer(query, delimiter);
        while (token.hasMoreTokens()){
            array.add(token.nextToken());
        }
        String[] result = array.toArray(new String[array.size()]);
        return result;
    }
}
