package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader( new FileReader(buf.readLine()));
        BufferedWriter fw = new BufferedWriter(new FileWriter(buf.readLine()));

        String s = fr.readLine();

        Pattern p = Pattern.compile("\\b+(\\d+)\\b+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            fw.write(m.group()+ " ");
        }


        buf.close();
        fr.close();
        fw.close();
    }
}
