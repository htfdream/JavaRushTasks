package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter(args[1]);
        //BufferedWriter bw = new BufferedWriter(fw);
        while (buf.ready()) {
            String s = buf.readLine();
            String[] arr = s.split(" ");
            for (String st: arr) {
                if(st.matches(".*\\d+.*")){
                    fw.write(st + " ");
                }

            }
            //fw.write("\n");
        }

        buf.close();
        //bw.close();
        fw.close();
    }
}
