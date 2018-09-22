package com.javarush.task.task08.task0815;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1","b - 1");
        map.put("2","b - 2" + 2);
        map.put("3","b - 3" + 3);
        map.put("4","b1 - 4" + 4);
        map.put("5","2b - 4");
        map.put("6","bb - 1");
        map.put("7","b - 1");
        map.put("8","b - 1");
        map.put("9","b - 21");
        map.put("10","b - 12");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        //HashMap<String,String> map1 = new HashMap<>(map);
        //map1.values().removeIf(x-> x.matches("^.* - (?!"+ name+ "$).*"));
        int n = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getValue().matches( name))
                n++;
        }


        return n;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        //HashMap<String,String> map1 = new HashMap<>(map);
        //map1.values().removeIf(x-> x.matches("^(?!"+ lastName + " - ).*$"));

        int n = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getKey().matches( lastName))
                n++;
        }


        return n;


    }

    public static void main(String[] args) {


    }
}
