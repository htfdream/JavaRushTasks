package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arrn = new ArrayList<Integer>();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arr.add(Integer.parseInt(buf.readLine()));
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 3 == 0)
                arr3.add(arr.get(i));
            if (arr.get(i) % 2 == 0)
                arr2.add(arr.get(i));
            if (arr.get(i) % 3 != 0 && arr.get(i) % 2 != 0)
                arrn.add(arr.get(i));
        }
        printList(arr3);
        printList(arr2);
        printList(arrn);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
