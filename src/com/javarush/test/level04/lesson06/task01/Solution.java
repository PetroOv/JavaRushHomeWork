package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = bf.readLine();
        String sNumber2 = bf.readLine();
        int iNumber1 = Integer.parseInt(sNumber1);
        int iNumber2 = Integer.parseInt(sNumber2);
        int min= iNumber1;
        if(iNumber1>iNumber2)
            min=iNumber2;
        System.out.println(min);

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
    }
}