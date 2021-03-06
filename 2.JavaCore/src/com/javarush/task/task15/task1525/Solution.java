package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
             BufferedReader buf = new BufferedReader(new FileReader(Statics.FILE_NAME));
             for (;true;) {
                 if (buf.ready()) {
                     lines.add(buf.readLine());
                 }
                 else break;
             }
        }
        catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
