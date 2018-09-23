package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(;true;) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int id = Integer.parseInt(s);
            s = reader.readLine();
            if (s.isEmpty()) {map.put(s,id); break;}
            String name = s;

            if (!map.containsKey(s))
                map.put(s,id);
        }

        for (Map.Entry<String,Integer> pair : map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }


    }
}
