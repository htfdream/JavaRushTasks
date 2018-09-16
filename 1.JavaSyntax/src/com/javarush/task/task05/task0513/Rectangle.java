package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void inititalize(int width, int height){
        this.height= height;
        this.width = width;
        this.top = 0;
        this.left = 0;
    }
    public void initialize(int width){
        this.width = width;
        this.height = height;
        this.top = 0;
        this.left = 0;
    }
    public void initialize(Rectangle rectangle){
        this.left = rectangle.left;
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.top = rectangle.top;
    }

    public static void main(String[] args) {

    }
}
