package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {


    public static void main(String[] args) throws Exception{
        int a = 8;
        int b = 30;
        int c = 8;
        int d = 4;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(s));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();

        while (reader.ready()){
            String st =reader.readLine();
            str.add(st);
            arr.add(Integer.parseInt(st.substring(0,8).trim()));
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
            else if (args[0].equals("-u")) {
                for (int i = 0; i < str.size(); i++) {
                    if(str.get(i).substring(0, 8).equals(pad(args[1], a))) {
                        str.set(i, pad(args[1],a) + pad(args[2],b) + pad(args[3],c) + pad(args[4], d));
                    }
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(s));
                for (String sw: str) {
                    writer.write(sw);
                    writer.newLine();
                }
                writer.close();

            }
            else if (args[0].equals("-d")) {
                for (int i = 0; i < str.size(); i++) {
                    if(str.get(i).substring(0, 8).equals(pad(args[1], a))) {
                        str.set(i, "");
                    }
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(s));
                for (String sw: str) {
                    if (!sw.isEmpty()){
                    writer.write(sw);
                    writer.newLine();
                    }
                }
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
