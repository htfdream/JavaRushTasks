package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        String s1 = buf.readLine();

        FileInputStream stream = new FileInputStream(s);
        byte[] b = new byte[stream.available()];
        stream.read(b);
        stream.close();
        stream = new FileInputStream(s1);
        FileOutputStream fileOutputStream = new FileOutputStream(s);
        while (stream.available() > 0) fileOutputStream.write(stream.read());
        fileOutputStream.write(b);
        stream.close();
        fileOutputStream.close();
    }
}
