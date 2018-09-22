package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("1", 123);
        map.put("2", 1232);
        map.put("3", 633);
        map.put("4", 234);
        map.put("5", 1231);
        map.put("6", 2123);
        map.put("7", 423);
        map.put("8", 1123);
        map.put("9", 6123);
        map.put("10", 4123);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        map.values().removeIf(x -> x < 500);

       /* for (Map.Entry<String, Integer> pair : map.entrySet()){
            if(pair.getValue().intValue() < 500)
                map.remove(pair.getKey());
        }*/
    }

    public static void main(String[] args) {

    }
}