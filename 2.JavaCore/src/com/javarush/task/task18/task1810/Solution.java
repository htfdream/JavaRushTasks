package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (;true;){
            try {
                FileInputStream stream = new FileInputStream(buf.readLine());
                if(stream.available()<1000){
                    stream.close();
                    throw new DownloadException();
                }
            }
            catch (IOException e){}


        }

    }

    public static class DownloadException extends Exception {

    }
}
