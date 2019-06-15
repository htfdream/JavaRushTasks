package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(buf.readLine())));
        String s = new String();

        while(file.ready()){
            s+=file.readLine();
        }
        String[] words = s.split(" ");
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
          StringBuilder result = new StringBuilder();
          if (words.length == 0){
              return result;
          }
          String s = words[0];
          ArrayList<String> used = new ArrayList<>();
          char firstvhar = s.toLowerCase().charAt(0);
          char lastchar = s.toLowerCase().charAt(s.length() - 1);
          result.append(s);
          used.add(s);
        for (int i = 1; i < words.length; i++) {
            for (int j = 1; j < words.length; j++) {
                if (!used.contains(words[j])) {
                    if (firstvhar == words[j].toLowerCase().charAt(words[j].length() - 1)) {
                        result.insert(0, words[j] + " ");
                        used.add(words[j]);
                        firstvhar = words[j].toLowerCase().charAt(0);

                    } else if (lastchar == words[j].toLowerCase().charAt(0)) {
                        result.append(" " + words[j]);
                        used.add(words[j]);
                        lastchar = words[j].toLowerCase().charAt(words[j].length() - 1);
                    }
                }
            }
        }



        return result;
    }
}
