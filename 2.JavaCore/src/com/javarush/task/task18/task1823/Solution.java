package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arr = new ArrayList<>();
        for(;true;){
            String s = buf.readLine();
            if (s.equals("exit")) break;
            arr.add(s);
        }
        buf.close();

        for (String g: arr
             ) {
            ReadThread thread = new ReadThread(g);
            thread.start();

        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try{
            FileInputStream stream = new FileInputStream(fileName);
            HashMap<Integer,Integer> map = new HashMap<>();
            while (stream.available() > 0){
                int n = stream.read();
                if (map.containsKey(n)){
                    map.put(n, map.get(n)+1);
                }
                else map.put(n, 1);
            }

            int max = Collections.max(map.values());
                for (Map.Entry<Integer,Integer> pair : map.entrySet()
                ) {
                    if(pair.getValue() == max) resultMap.put(fileName, pair.getKey());
                }
                stream.close();
            }
            catch (Exception e){

            }

        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
