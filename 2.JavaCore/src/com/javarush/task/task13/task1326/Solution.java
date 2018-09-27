package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String path = buf.readLine();
        InputStreamReader ii = new InputStreamReader(new FileInputStream(path));

        BufferedReader nb = new BufferedReader(ii);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(;true;){
            String s;
            if (nb.ready())
            s = nb.readLine();
            else break;
            //System.out.println(nb.ready());
            arr.add(Integer.parseInt(s));
        }
        arr.removeIf(x -> x % 2 != 0);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) < arr.get(j))
                {
                    int n = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, n);
                }
            }
        }

        for(Integer n : arr){
            System.out.println(n);
        }

        buf.close();
        ii.close();


    }
}
