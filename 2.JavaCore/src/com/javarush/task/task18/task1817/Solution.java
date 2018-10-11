package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream stream = new FileInputStream(args[0]);
        int n = 0;
        int k = stream.available();
        while (stream.available()>0){
            int i = stream.read();
            if ((char)i == ' ') n++;
        }
        //double d = (double)n/(k-n);
        //System.out.println(d);
        //System.out.println(String.format("%.2f", d));
        //System.out.println(Math.round((double)n/k));
        //System.out.println(String.format("%.5g%n",(n*100/(float)k)));
        stream.close();

        System.out.println(String.format("%.2f", (float)n/k*100.0));
    }


}
