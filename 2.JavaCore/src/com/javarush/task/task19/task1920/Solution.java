package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader(args[0]);
        BufferedReader buf = new BufferedReader(fr);
        HashMap<String, Double> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        while (buf.ready()) {
            String[] s = buf.readLine().split(" ");
            if (!arr.contains(s[0])) {
                arr.add(s[0]);
                map.put(s[0], Double.parseDouble(s[1]));
            } else {
                map.replace(s[0], map.get(s[0]) + Double.parseDouble(s[1]));
            }
        }
        buf.close();
        fr.close();

        Collections.sort(arr);
        Double max = Collections.max(map.values());

        for (String s :
                arr) {
            if (map.get(s).equals(max)){
            System.out.println(s);}
        }
    }
}
