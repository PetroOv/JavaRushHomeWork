package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by petro_000 on 1/22/2015.
 */
public abstract class DrinkMaker
{
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
