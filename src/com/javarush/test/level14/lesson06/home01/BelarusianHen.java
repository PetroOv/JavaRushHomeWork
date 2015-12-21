package com.javarush.test.level14.lesson06.home01;

/**
 * Created by petro_000 on 1/21/2015.
 */
class BelarusianHen extends  Hen{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 27;
    }
    public String getDescription() {

        return super.getDescription() + " Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";

    }
}



