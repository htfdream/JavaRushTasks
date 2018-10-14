package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(buf.readLine()));

        while (br.ready()){
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
            s = sb.reverse().toString();
            System.out.println(s);
        }
        buf.close();
        br.close();
    }
}
