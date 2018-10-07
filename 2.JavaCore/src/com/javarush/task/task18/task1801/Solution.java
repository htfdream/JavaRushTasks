package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        int n =0;
        FileInputStream stream = new FileInputStream(s);
        while (stream.available()>0){
            int b = stream.read();
            if (n < b) n = b;
        }
        buf.close();
        stream.close();
        System.out.println(n);

    }
}
