package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] arr = s.toCharArray();
        if (arr[0] != ' ')
            arr[0] = Character.toUpperCase(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != ' ' &&  arr[i-1] == ' '){
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        s = String.valueOf(arr);

        /*int n = 0;
        if (s.indexOf(" ") == 0)
        String str = s.substring(0,1).toUpperCase();
       // System.out.println(str);
        for (int i = 0; i < s.length(); i++) {

            n = s.indexOf(" ", n+1);
           // System.out.println(n);
            if (n != -1){
            str += s.substring(i+1, n+1);
            str += s.substring(n+1, n+2).toUpperCase();
            i = n;
            }
            else {str+=s.substring(i+1);break;}
        }
        s = str;
        System.out.println(s);*/
        //напишите тут ваш код
        System.out.println(s);
    }
}
