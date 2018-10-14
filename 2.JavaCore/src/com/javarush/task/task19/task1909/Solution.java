package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(buf.readLine()));
        BufferedWriter bw = new BufferedWriter(new FileWriter(buf.readLine()));

        while (br.ready()) {
            String s = br.readLine();
            s = s.replace('.','!');
            bw.write(s);
            bw.newLine();
        }
        buf.close();
        br.close();
        bw.close();

    }
}
