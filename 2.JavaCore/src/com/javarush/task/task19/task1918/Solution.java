package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws  Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bf = new BufferedReader(new FileReader(buf.readLine()));

        Pattern pp = Pattern.compile("<" + args[0] + ".*?>");
        ArrayList<Integer> open = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        String s = "";

        while (bf.ready()){
            s += bf.readLine();
        }
        s = s.replaceAll("\r\n", "");

        Matcher m = pp.matcher(s);

        while (m.find()){
            open.add(m.start());
        }

        pp = Pattern.compile("</?" + args[0] + ".*?>");
        m = pp.matcher(s);
        while (m.find()){
            all.add(m.start());
        }

        for (Integer on: open) {
            int i = 1;
            for (Integer of: all) {
                if (of > on) {
                    if (of != on && open.contains(of)) i++;
                    if (!open.contains(of)) i--;
                    if (i == 0) {
                        System.out.println(s.substring(on, of + 3 + args[0].length()));
                        break;
                    }
                }
            }
        }

        buf.close();
        bf.close();
    }
}
