package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        double i = 0;
        int sum = 0;
        for (; true; ) {

            int n = Integer.parseInt(buf.readLine());

            if (n == -1){
                System.out.println(sum/i);
                break;
            }
            else{
                sum += n;
                i++;
            }

        }
    }
}

