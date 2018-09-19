package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> arr = new HashSet<String>();
        arr.add("арбуз");
        arr.add("банан");
        arr.add("вишня");
        arr.add("груша");
        arr.add("дыня");
        arr.add("ежевика");
        arr.add("женьшень");
        arr.add("земляника");
        arr.add("ирис");
        arr.add("картофель");

        for (String s : arr){
            System.out.println(s);
        }

    }
}
