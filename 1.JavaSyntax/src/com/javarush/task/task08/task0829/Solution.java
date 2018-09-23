package com.javarush.task.task08.task0829;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a="";
        //list of addresses
        //List<String> addresses = new ArrayList<String>();
        HashMap<String,String> map = new HashMap<String, String>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;

            map.put(town,family);
        }
        //System.out.println("find");
        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String tf = reader.readLine();
        /*if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/
        if (!tf.isEmpty() && map.containsKey(tf)){
            //System.out.println("find");
            for (Map.Entry pair : map.entrySet()){
                if (pair.getKey().equals(tf))
                    a = pair.getValue().toString();
            }
        }
        System.out.println(a);
    }
}
