package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[5];

        for(int i=0;i<5;i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        for (int i=0;i<5;i++){
            for(int j=1;j<5;j++){
                if (array[j-1]>array[j]){
                    int buf = array[j-1];
                    array[j-1]=array[j];
                    array[j]=buf;
                }
            }
        }

        //Напишите тут ваш код
        for(int i=0;i<5;i++)
            System.out.println(array[i]);
    }
}
