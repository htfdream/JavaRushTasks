package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = buf.readLine().toCharArray();
        ArrayList<Character> av = new ArrayList<Character>();
        ArrayList<Character> anv = new ArrayList<Character>();

        for(char c : arr){
            if (isVowel(c))
                    av.add(c);
            else if (c!= ' ') anv.add(c);
        }

        for (char c : av){
            System.out.print(c+ " ");
        }
        System.out.println("");
        for (char c : anv){
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}