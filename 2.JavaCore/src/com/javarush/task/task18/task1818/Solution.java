package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream stream1 = new FileOutputStream(buf.readLine());
        FileInputStream stream2 = new FileInputStream(buf.readLine());
        FileInputStream stream3 = new FileInputStream(buf.readLine());
        buf.close();

        while (stream2.available() > 0) stream1.write(stream2.read());
        while (stream3.available() > 0) stream1.write(stream3.read());

        stream1.close();
        stream2.close();
        stream3.close();
    }
}
