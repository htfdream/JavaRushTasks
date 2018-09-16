package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш
        int sum = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for(;true;){
            String s = buf.readLine();
            if (s.equals("сумма")){
                System.out.println(sum);
                break;
            }
            else{
                int n = Integer.parseInt(s);
                sum+=n;
            }
        }
    }
}
