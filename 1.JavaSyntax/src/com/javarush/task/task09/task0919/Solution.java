package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try{
            divisionByZero();
        }
        catch (Exception e){
            //System.out.println(1);
            e.printStackTrace();
        }
    }

    public static void divisionByZero() throws Exception{
        int a = 10/0;
        System.out.println(a);
    }
}