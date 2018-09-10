package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double d;
        d = convertEurToUsd(10,1.3);
        System.out.println(d);
        d= convertEurToUsd(23, 1.4);
        System.out.println(d);
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double r = eur * course;
        return r;
    }
}
