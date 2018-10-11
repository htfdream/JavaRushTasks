package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream  extends FileOutputStream{
    public static String fileName = "2.txt";
    private FileOutputStream orig;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException{
        super("1.txt");
        this.orig = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        orig.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        orig.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        orig.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        orig.flush();
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        orig.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }


}
