package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String path = buf.readLine();

        BufferedWriter bout = new BufferedWriter(new FileWriter(path));

        for(;true;){
            String s = buf.readLine();
            if (s.equals("exit")){
                bout.append(s);
                bout.newLine();
                break;
            }
            bout.append(s);
            bout.newLine();
        }
        bout.close();
        buf.close();
    }
}
