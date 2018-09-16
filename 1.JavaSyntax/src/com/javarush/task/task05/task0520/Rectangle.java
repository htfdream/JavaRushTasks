package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height){
        this.height= height;
        this.width = width;
        this.top = 0;
        this.left = 0;
    }
    public Rectangle(int width){
        this.width = width;
        this.height = height;
        this.top = 0;
        this.left = 0;
    }
    public Rectangle(Rectangle rectangle){
        this.left = rectangle.left;
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.top = rectangle.top;
    }

    public static void main(String[] args) {

    }
}
