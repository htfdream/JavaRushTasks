package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args){

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try{
        String s = buf.readLine();
        if (s.equals("helicopter")){
            result = new Helicopter();
        }
        else if (s.equals("plane")){
            int n = Integer.parseInt(buf.readLine());
            result = new Plane(n);
        }
        buf.close();
        }
        catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }
        //add your code here - добавьте код тут
    }
}
