package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        FileInputStream stream = new FileInputStream(s);
        int n = stream.read();
        while (stream.available() > 0){
            int t = stream.read();
            if (n > t) n = t;
        }
        buf.close();
        stream.close();
        System.out.println(n);
    }
}
