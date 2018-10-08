package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        FileInputStream stream = new FileInputStream(s);

        Map<Integer,Integer> map = new HashMap<>();

        while (stream.available() > 0){
            Integer n = stream.read();
            if (map.containsKey(n)){
                //System.out.println(n + "  "+ map.get(n));
                map.replace(n, map.get(n) + 1);
            }
            else{
                map.put(n, 1);
            }
        }
        int max = 0;
        for (int i: map.values()) {
            if (max < i) max = i;
        }

        for (Map.Entry pair : map.entrySet()) {
            if (pair.getValue().equals(max)){
                System.out.print(pair.getKey() + " ");
            }
        }
        buf.close();
        stream.close();
    }
}
