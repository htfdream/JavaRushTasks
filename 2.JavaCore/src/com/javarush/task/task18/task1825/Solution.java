package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> set = new ArrayList<>();
        String filename;
        for(;true;){
            String s = reader.readLine();
            if (s.equals("end")) break;
            set.add(s);
        }
        reader.close();
        filename = set.iterator().next();
        filename = filename.substring(0, filename.lastIndexOf("."));

        File file = new File(filename);
        file.createNewFile();
        FileOutputStream fo = new FileOutputStream(filename);
        //int n = 1;
        for (int i = 1; i <= set.size(); i++) {
            String s = filename + ".part" + i;
            FileInputStream fi = new FileInputStream(s);
            byte[] b = new byte[fi.available()];
            fi.read(b);
            fo.write(b);
            fi.close();
        }
        fo.close();


    }
}
