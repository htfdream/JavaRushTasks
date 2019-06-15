package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name", "er");
        map.put("country","null");
        map.put("city","null");
        map.put("age","null");
        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> ent: params.entrySet()
             ) {
            if (ent.getValue() != null){
                if(!ent.getValue().equals("null")){
                    result.append(ent.getKey()+ " = '" + ent.getValue() + "'" );
                    result.append(" and ");
                }

            }
        }
        if (result.length() == 0
        )
        {return result.toString();}
        return result.substring(0, result.lastIndexOf(" and"));
    }
}
