package com.javarush.task.task18.task1805;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        FileInputStream stream = new FileInputStream(s);
        ArrayList<Integer> arr = new ArrayList<>();
        //Collection<Integer> col = new ArrayList<>();
        //ArrayList<Integer> sort = new ArrayList<>();
        while (stream.available() > 0){
            int n = stream.read();
            if (!arr.contains(n)){
                arr.add(n);
            }
        }
        buf.close();
        stream.close();
        Collections.sort(arr);

        for (Integer n: arr) {
            System.out.print(n + " ");
        }
    }
}
