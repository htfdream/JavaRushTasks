package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(buf.readLine());
        int n = 0;
        String s = "";
        while (fr.ready()){
            char c =  (char)fr.read();
                s += c;
        }
        Pattern p = Pattern.compile("\\b");
        Matcher m = p.matcher(s);
        String[] fields = p.split(s);
        for (int i = 0; i < fields.length; i++)
            if(fields[i].equals("world")) n++;

        buf.close();
        fr.close();
        System.out.println(n);
    }
}
