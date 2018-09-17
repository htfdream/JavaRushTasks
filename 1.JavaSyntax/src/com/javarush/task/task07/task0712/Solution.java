package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arr.add(buf.readLine());
        }
        int min = arr.get(0).length();
        int max = arr.get(0).length();

        for (int i = 0; i < arr.size(); i++) {
            if (min > arr.get(i).length())
                min = arr.get(i).length();
            if (max < arr.get(i).length())
                max = arr.get(i).length();

        }

        for (int i = 0; i < arr.size(); i++) {
            if ( arr.get(i).length() == min || arr.get(i).length() == max){
                System.out.println(arr.get(i));
            break;}
        }
    }
}
