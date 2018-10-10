package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(buf.readLine());
        buf.close();
        int i = 0;
        while (stream.available() > 0){
            if (stream.read() == 44)
                i++;
        }
        stream.close();
        System.out.println(i);

    }
}
