package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String path = buf.readLine();
        InputStream imp = new FileInputStream(path);
        while (imp.available()>0){
            System.out.print((char)imp.read());
        }
        imp.close();
        buf.close();
    }
}