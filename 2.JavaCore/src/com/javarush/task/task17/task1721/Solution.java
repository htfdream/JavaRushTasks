package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader f1 = new BufferedReader(new FileReader(buf.readLine()));
            BufferedReader f2 = new BufferedReader(new FileReader(buf.readLine()));

            while (f1.ready()){
                allLines.add(f1.readLine());
            }
            while (f2.ready()){
                forRemoveLines.add(f2.readLine());
            }
            Solution sol = new Solution();
            sol.joinData();

            for (String s : allLines) {
                System.out.println(s);
            }
        }
        catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }

    }

    public void joinData () throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
