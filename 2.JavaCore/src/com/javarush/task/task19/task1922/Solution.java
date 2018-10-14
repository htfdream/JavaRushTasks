package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader st = new BufferedReader(new FileReader(buf.readLine()));

        while (st.ready()){
            String sr = st.readLine();
            String[] s = sr.split(" ");
            int n = 0;
            for (String ss : s) {
                if (words.contains(ss)) n++;
            }
            if (n == 2) System.out.println(sr);
        }
        buf.close();
        st.close();

    }
}
