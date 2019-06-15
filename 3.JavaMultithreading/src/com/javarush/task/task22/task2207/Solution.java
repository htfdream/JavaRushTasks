package com.javarush.task.task22.task2207;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        //FileInputStream file = new FileInputStream(buf.readLine());
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(buf.readLine())));
        Charset charset = StandardCharsets.UTF_8;
        String ss = new String();

        while (file.ready() == true){
            ss += file.readLine();
            ss += " ";
        }

        //System.out.println(ss);
        String[] array = ss.split(" ");

        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder(array[i]);
            sb.reverse();
            //System.out.println(sb);
            for (int j = i + 1; j < array.length; j++) {
                if(sb.toString().equals(array[j])){
                    Pair pair = new Pair();
                    pair.first = array[i];
                    pair.second = array[j];
                    if (!result.contains(pair)
                         ) {
                        result.add(pair);
                    }
                }
            }

        }

        for (Pair ent: result
             ) {
            System.out.println(ent.first + " " + ent.second);
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
