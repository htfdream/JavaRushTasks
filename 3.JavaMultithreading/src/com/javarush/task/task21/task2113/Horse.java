package com.javarush.task.task21.task2113;

import java.util.Formatter;

public class Horse {
    private String name;
    private double speed;
    private double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void move(){
        distance += speed * Math.random();
    }

    public void print(){
        Formatter format = new Formatter();
        String s = "%s";
        if ((int)distance != 0) {s = "%" + (int)distance + "c%s";
        format.format(s ,' ', name);}
        else format.format(s , name);
        System.out.println(format.toString().replace(' ', '.'));
    }
}
