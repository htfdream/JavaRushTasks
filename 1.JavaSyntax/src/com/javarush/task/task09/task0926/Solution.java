package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] arr1 = {51,52,53,54,55};
        int[] arr2 = {21,22};
        int[] arr4 = {41,42,43,44};
        int[] arr7 = {71,72,73,74,75,76,77};
        int[] arr0 = {};
        list.add(arr1);
        list.add(arr2);
        list.add(arr4);
        list.add(arr7);
        list.add(arr0);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
