package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {

            arr.add(buf.readLine());
        }
        int n = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (n <= arr.get(i).length()) {

                n = arr.get(i).length();
            }
            else {
                System.out.println(i);
                break;
            }
        }
    }
}

