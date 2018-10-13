package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //int n = Integer.parseInt(args[0]);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        //String st = buf.readLine();

        BufferedReader stream = new BufferedReader(new FileReader(buf.readLine()));


        //System.out.println(s);
        int id = 0;
        String productName = "";
        double price = 0;
        int quantity = 0;
        while (stream.ready()) {
            String s = stream.readLine();
            if (s.substring(0, s.indexOf(" ")).equals(args[0])){
                /*id = Integer.parseInt(s.substring(0, s.indexOf(" ")));
                s = s.substring(s.indexOf(" ") + 1);
                quantity = Integer.parseInt(s.substring(s.lastIndexOf(" ")+1));
                s = s.substring(0, s.lastIndexOf(" "));
                price = Double.parseDouble(s.substring(s.lastIndexOf(" ")+1));
                productName = s.substring(0, s.lastIndexOf(" "));
                System.out.println(id + " " + productName + " " + price + " " + quantity);*/
                System.out.println(s);
                break;
            }
        }
        stream.close();



    }
}
