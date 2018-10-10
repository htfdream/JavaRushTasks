package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(buf.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(buf.readLine());
        byte[] bytes = new byte[fileInputStream.available()];
        buf.close();

        fileInputStream.read(bytes);

        for (int i = bytes.length -1; i >=0; i--) {
            fileOutputStream.write(bytes[i]);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
