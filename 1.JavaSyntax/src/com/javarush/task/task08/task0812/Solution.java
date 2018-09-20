package com.javarush.task.task08.task0812;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(buf.readLine()));
        }

        int m = 0;
        int n = 1;

        for (int i = 0; i < arr.size()-1; i++) {
            int a = arr.get(i);
            int b = arr.get(i+1);

            if (a == b){
                n++;

            }
            else if (n>=m) {
                m = n;
                n = 1;

            }

        }
        if (n>m)
            m = n;
        System.out.println(m);
    }
}