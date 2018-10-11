package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream stream = new FileInputStream(args[0]);
        int n = 0;
        while (stream.available()>0){
            int i = stream.read();
            if((i >= 65 && i <= 90) || (i >= 97 && i <= 122) ) n++;
        }
        System.out.println(n);
        stream.close();
    }
}
