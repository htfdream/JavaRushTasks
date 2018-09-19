package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            arr.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {

            arr.add(arr.get(0));
            arr.remove(0);
        }
        //напишите тут ваш код
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
