package com.javarush.task.task18.task1826;

/* 
Шифровка
*/


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {

    public static void main(String[] args) throws Exception{


        if (args[0].equals("-e")){
            FileInputStream fi = new FileInputStream(args[1]);
            FileOutputStream fo = new FileOutputStream(args[2]);

            while (fi.available()>0){
                int b = fi.read() + 10;
                fo.write(b);
            }

            fo.close();
            fi.close();
        }
        else{
            FileInputStream fi = new FileInputStream(args[1]);
            FileOutputStream fo = new FileOutputStream(args[2]);
            while (fi.available()>0){
                int b = fi.read() - 10;
                fo.write(b);
            }
            fo.close();
            fi.close();
        }

    }

}
