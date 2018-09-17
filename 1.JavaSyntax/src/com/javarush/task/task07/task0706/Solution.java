package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[15];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(buf.readLine());
        }
        int sp = 0;
        int sn = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i%2==0)
                sp+=arr[i];
            else
                sn +=arr[i];
        }

        if (sp > sn)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (sp<sn)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
