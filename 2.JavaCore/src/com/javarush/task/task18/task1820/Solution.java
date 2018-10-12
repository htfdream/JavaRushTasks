package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream s1 = new FileInputStream(buf.readLine());
        FileOutputStream s2 = new FileOutputStream(buf.readLine());
        buf.close();
        String s = "";
        while (s1.available() > 0){

            char c = (char)s1.read();
            if (!(c == ' ')){
                s+=c;
            }
            else {
                int t = (int)Math.round(Double.parseDouble(s));

                //Byte b = Byte.parseByte()
                s2.write(String.valueOf(t).getBytes());
                s2.write(' ');
                s = "";
            }
            if (s1.available() <= 0){
                int t = (int)Math.round(Double.parseDouble(s));
                s2.write(String.valueOf(t).getBytes());
            }
        }
        s1.close();
        s2.close();
    }
}
