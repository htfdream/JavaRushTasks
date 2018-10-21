package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {



        FileOutputStream outputStream = new FileOutputStream("2.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        Solution savedObject = new Solution(5);



        objectOutputStream.writeObject(savedObject);

        FileInputStream inputStream = new FileInputStream("2.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Solution loadedObject;
        loadedObject = (Solution) objectInputStream.readObject();

        System.out.println(savedObject.string);
        System.out.println(loadedObject.string);

        System.out.println(new Solution(4));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
