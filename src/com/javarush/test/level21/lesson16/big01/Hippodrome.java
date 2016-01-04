package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

public class Hippodrome
{
    public static Hippodrome game;
    private static ArrayList<Horse> horses = new ArrayList<Horse>();

    public static void main(String[] args) throws Exception
    {
        game = new Hippodrome();

        Horse horse1 = new Horse("Таракан", 3, 0);
        Horse horse2 = new Horse("Ліда", 3, 0);
        Horse horse3 = new Horse("Андрій", 3, 0);

        game.horses.add(horse1);
        game.horses.add(horse2);
        game.horses.add(horse3);

        game.run();
        game.printWinner();
    }

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public void move()
    {
        for (Horse horse : getHorses())
            horse.move();

    }

    public void run() throws InterruptedException
    {
        for (int i = 0; i < 20; i++)
        {
            move();
            print();
            Thread.sleep(500);
        }

    }

    public void print()
    {
        for (Horse horse : getHorses())
        {
            horse.print();
        }
        System.out.println();
        System.out.println();

    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse horse : horses)
        {
            if (horse.getDistance() > winner.getDistance())
                winner = horse;
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

}

