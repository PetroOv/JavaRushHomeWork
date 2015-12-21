package com.javarush.test.level14.lesson06.home01;

/**
 * Created by petro_000 on 1/21/2015.
 */
class RussianHen extends Hen{

    int getCountOfEggsPerMonth(){
        return 100;
    }
    String getDescription(){
        String s = super.getDescription() +" Моя страна - " + Country.RUSSIA  +". Я несу " + getCountOfEggsPerMonth() +  " яиц в месяц." ;
        return s;
    }
}