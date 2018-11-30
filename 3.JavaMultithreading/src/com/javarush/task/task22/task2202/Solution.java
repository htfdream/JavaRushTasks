package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        try {
            String s[] = string.split(" ");
            return s[1]+ " " + s[2]+ " "+ s[3]+ " "+s[4];
        }
        catch (Exception e){
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
