package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

            a = Integer.parseInt(buf.readLine());
            b = Integer.parseInt(buf.readLine());
            if (a <= 0 || b <= 0) throw new Exception();

            for (;true;){
                if (a != 0 && b != 0){
                    if (a > b){
                        a = a % b;
                    }
                    else {
                        b = b % a;
                    }
                }
                else if (a == 0) {
                    System.out.println(b);
                    break;
                }
                else {
                    System.out.println(a);
                    break;
                }
            }


    }
}
