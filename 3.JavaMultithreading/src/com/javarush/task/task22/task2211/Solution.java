package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream(args[0]);
        FileOutputStream file2 = new FileOutputStream(args[1]);
            byte[] buffer = new byte[file1.available()];
            file1.read(buffer);
            String contents = new String(buffer, "Windows-1251");
            buffer = contents.getBytes("UTF-8");
            file2.write(buffer);
        file1.close();
        file1.close();
    }
}
