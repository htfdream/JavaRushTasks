package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream orgstream;
    public QuestionFileOutputStream(AmigoOutputStream stream){this.orgstream = stream;}

    @Override
    public void flush() throws IOException {
        orgstream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        orgstream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        orgstream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        orgstream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        if (buf.readLine().equals("Д")) orgstream.close();

    }
}

