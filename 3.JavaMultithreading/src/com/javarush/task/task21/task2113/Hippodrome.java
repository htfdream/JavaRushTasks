package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }
    
    public Hippodrome(List horses){
        this.horses = horses;
    }

    public void move(){
        for (Horse horse: horses) {
            horse.move();
        }
    }

    public void print(){
        for (Horse horse: horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    public void run(){
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public Horse getWinner(){
        Horse winner = new Horse("", 0, 0);

        for (Horse horse: horses) {
            if (winner.getDistance() < horse.getDistance()){
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 3, 0);
        Horse horse3 = new Horse("horse3", 3, 0);
        List<Horse> horses = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
