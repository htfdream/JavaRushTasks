package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //add your code here
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        ArrayList<String> list = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        s = s.substring(s.indexOf("?")+1);
        for(;true;) {
            if(s.indexOf("&") != -1){
                list1.add(s.substring(0, s.indexOf("&")));
                s = s.substring(s.indexOf("&")+1);
            }
            else {
                list1.add(s);
                break;
            }

        }

        for (String ss: list1) {
            if (ss.indexOf("=") != -1){
                list.add(ss.substring(0, ss.indexOf("=")));
                map.put(ss.substring(0, ss.indexOf("=")), ss.substring(ss.indexOf("=")+1));
            }
            else{
                list.add(ss);
                map.put(ss,"");
            }

        }


        for (String st : list) {
            System.out.print(st + " ");

        }
        System.out.println("");

        if (list.contains("obj")){
            String d = map.get("obj");

            try{
                double dd = Double.parseDouble(d);
                alert(dd);
            }
            catch (Exception e){
                alert(d);
            }

        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
