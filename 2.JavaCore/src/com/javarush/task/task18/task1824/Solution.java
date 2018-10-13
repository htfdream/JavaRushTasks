package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static boolean run = true;
    public static String s;
    public static void main(String[] args)throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<FileInputStream>  arr = new ArrayList<>();
        //String s = "313";
        while (run) {
            s = buf.readLine();
            try {
                arr.add(new FileInputStream(s));
            }
            catch (FileNotFoundException e){
                System.out.println(s);
                if (!arr.isEmpty()) {
                    for (FileInputStream st : arr) {
                        st.close();
                    }
                }
                run = false;
            }

        }

    }
}
