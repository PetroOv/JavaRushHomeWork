package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int count = 4;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[count];
        String[] sNumber = new String[count];
        for(int i =0; i<count;i++){
            sNumber[i]=bf.readLine();
            array[i]=Integer.parseInt(sNumber[i]);
        }
        System.out.println(Min(array));
    }
    public static int Min(int[] brray){
        int min= brray[0];
        for(int  i =0;i<brray.length;i++){
            if (min<brray[i])
                min=brray[i];
        }
        return min;
    }
}
