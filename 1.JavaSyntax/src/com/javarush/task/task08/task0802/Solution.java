package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
анан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> arr = new HashMap<String, String>();
        arr.put("арбуз", "ягода");
        arr.put("банан", "трава");
        arr.put("вишня","ягода");
        arr.put("груша", "фрукт");
        arr.put("дыня", "овощ");
        arr.put("ежевика","куст");
        arr.put("жень-шень", "корень");
        arr.put("земляника", "ягода");
        arr.put("ирис","цветок");
        arr.put("картофель", "клубень");

        for (Map.Entry<String,String> s : arr.entrySet()){
            String key = s.getKey();
            String value = s.getValue();

            System.out.println(key + " - "+ value);
        }
    }
}
