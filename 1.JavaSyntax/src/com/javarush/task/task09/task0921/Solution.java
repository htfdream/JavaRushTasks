package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        try{
            for (;true;){
                arr.add(Integer.parseInt(buf.readLine()));
            }
        }
        catch (NumberFormatException e){
            for (Integer n : arr){
                System.out.println(n);
            }
        }
        catch (IOException e){

        }
    }
}
