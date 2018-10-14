package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(buf.readLine()));
        BufferedWriter bw = new BufferedWriter(new FileWriter(buf.readLine()));

        while (br.ready()) {
            String s = br.readLine();
            s = s.replaceAll("[\\pP\\n]","");
            bw.write(s);

        }
        buf.close();
        br.close();
        bw.close();
    }
}
