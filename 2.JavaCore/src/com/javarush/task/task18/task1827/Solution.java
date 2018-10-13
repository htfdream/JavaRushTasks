package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 8;
        int b = 30;
        int c = 8;
        int d = 4;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(s));
        ArrayList<Integer> arr = new ArrayList<>();

        while (reader.ready()){
            arr.add(Integer.parseInt(reader.readLine().substring(0,8).trim()));
        }
        reader.close();
        int max = Collections.max(arr);

        if(args.length > 0) {
            if (args[0].equals("-c")) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(s,true));
                String g = "";
                g += pad(String.valueOf(max+1), a);
                g+= pad(args[1], b) + pad(args[2], c) + pad(args[3], d);
                writer.newLine();
                writer.write(g);
                writer.close();
            }
        }

    }

    public static String pad (String s, int n){
        while (s.length() < n) {
            s += " ";
        }
        return s;
    }
}
