package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f1 = new BufferedReader(new FileReader(buf.readLine()));
        BufferedReader f2 = new BufferedReader(new FileReader(buf.readLine()));
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        while (f1.ready()){
            s1.add(f1.readLine());
        }
        while (f2.ready()){
            s2.add(f2.readLine());
        }

        ArrayList<String> r1 = new ArrayList<>();
        ArrayList<String> r2 = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        int max = Math.max(s1.size(), s2.size());
        while (p1 < s1.size() || p2 < s2.size()) {
            if (p1 < s1.size() && p2 < s2.size()) {
                if (s1.get(p1).equals(s2.get(p2))) {
                    r1.add(s1.get(p1));
                    r2.add(s2.get(p2));
                    p1++;
                    p2++;
                } else {
                    if (p1 < s1.size() - 1 && p2 < s2.size()) {
                        if (s1.get(p1 + 1).equals(s2.get(p2))) {
                            r1.add(s1.get(p1));
                            r2.add("");
                            p1 = p1 + 1;
                        }
                    }

                    if (p2 < s2.size() - 1 && p1 < s1.size()) {
                        if (s1.get(p1).equals(s2.get(p2 + 1))) {
                            r1.add("");
                            r2.add(s2.get(p2));
                            p2 = p2 + 1;
                        }
                    }
                }
            }
            if (p1 < s1.size() && p2 >= s2.size()) {
                r1.add(s1.get(p1));
                r2.add("");
                p1 = p1 + 1;
            }
            if (p2 < s2.size() && p1 >= s1.size()) {
                r1.add("");
                r2.add(s2.get(p2));
                p2 = p2 + 1;
            }
        }
        buf.close();
        f1.close();
        f2.close();

        for (int i = 0; i < r1.size(); i++) {
            if (r1.get(i).equals("")){
                lines.add(new LineItem(Type.ADDED, r2.get(i)));
            }
            else if (r2.get(i).equals("")){
                lines.add(new LineItem(Type.REMOVED, r1.get(i)));
            }
            else lines.add(new LineItem(Type.SAME, r1.get(i)));
        }




    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
