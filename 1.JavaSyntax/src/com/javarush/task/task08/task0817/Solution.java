package com.javarush.task.task08.task0817;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
       HashMap<String, String> map1 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> st : map1.entrySet()) {
            for (Map.Entry<String, String> pair : map.entrySet()){
                if(!st.getKey().equals(pair.getKey()) && st.getValue().equals(pair.getValue()))
                removeItemFromMapByValue(map, st.getValue());
                break;
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {


    }
}
