package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter(args[1]);
        int n = 0;
        while (bf.ready()) {
            String[] arr = bf.readLine().split(" ");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 6) {
                    if (!(n == 0)) fw.write(',');
                    fw.write(arr[i]);
                    n++;
                }
            }
            //fw.write("\n");
        }

        bf.close();
        fw.close();

    }
}
