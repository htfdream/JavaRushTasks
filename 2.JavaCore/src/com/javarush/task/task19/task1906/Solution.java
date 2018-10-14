package com.javarush.task.task19.task1906;

/* 
Четные символы
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(buf.readLine());
        FileWriter fw = new FileWriter(buf.readLine());
        buf.close();
        int i = 1;
        while (fr.ready()){
            if( i%2 == 0){
                fw.write(fr.read());
            }
            else fr.read();

            i++;
        }
        fr.close();
        fw.close();
    }
}
