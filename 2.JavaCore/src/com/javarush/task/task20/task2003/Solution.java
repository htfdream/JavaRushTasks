package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties prop = new Properties();

    public void fillInPropertiesMap() throws Exception{
        //implement this method - реализуйте этот метод
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(buf.readLine());
        load(inputStream);
        buf.close();
        inputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));

        if(!properties.isEmpty()){
            for (Map.Entry<String,String> pair: properties.entrySet()) {
               prop.put(pair.getKey(), pair.getValue());
            }
        }
        prop.store(outputStream, "prop1");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
       // BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));

        prop.load(inputStream);
        for (Map.Entry<Object, Object> pair: prop.entrySet()
             ) {
            properties.put(pair.getKey().toString(), pair.getValue().toString());
        }
    }

    public static void main(String[] args) throws Exception{
        Solution solution = new Solution();
        solution.fillInPropertiesMap ();

        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");
        solution.save(fileOutputStream);
        fileOutputStream.close();

    }
}
