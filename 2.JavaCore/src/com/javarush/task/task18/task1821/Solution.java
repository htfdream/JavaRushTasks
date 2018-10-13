package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream stream = new FileInputStream(args[0]);
        int[] arr = new int[256];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }

        while (stream.available() > 0) {
            int b = stream.read();
            arr[b]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                System.out.println((char)i + " " + arr[i]);
            }
        }
        stream.close();

    }
}
