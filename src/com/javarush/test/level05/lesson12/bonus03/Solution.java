package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] array = new int[count];

        if (count <= 0){

            System.out.println("Error. Try Again");
            System.exit(0);
        }
        int maximum =Integer.parseInt(reader.readLine());
        for(int i =1;i<count;i++){
            array[i] = Integer.parseInt(reader.readLine());
            if (maximum <array[i])
                maximum=array[i];
        }


        //напишите здесь ваш код
        System.out.println(maximum);
    }
}
