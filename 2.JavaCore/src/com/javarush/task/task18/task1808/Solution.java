package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(buf.readLine());
        FileOutputStream fileOutputStream1 = new FileOutputStream(buf.readLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(buf.readLine());
        buf.close();

        int n = (fileInputStream.available() + 1)/2;
        for (int i = 0; i < n; i++) {
            fileOutputStream1.write(fileInputStream.read());
        }
       while (fileInputStream.available() > 0){
           fileOutputStream2.write(fileInputStream.read());
       }
       fileInputStream.close();
       fileOutputStream1.close();
       fileOutputStream2.close();
    }
}
