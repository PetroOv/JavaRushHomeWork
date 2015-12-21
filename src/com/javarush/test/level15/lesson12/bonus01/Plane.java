package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by petro_000 on 1/22/2015.
 */
public class Plane implements Flyable
{
    private int passCount=0;
    public Plane(int passCount){
        this.passCount = passCount;

    }



    @Override
    public void fly()
    {

    }
}
