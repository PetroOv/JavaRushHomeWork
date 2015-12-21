package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int count = 3;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[count];
        String[] sNumber = new String[count];
        for(int i =0; i<count;i++){
            sNumber[i]=bf.readLine();
            array[i]=Integer.parseInt(sNumber[i]);
        }
        Poryadok(array);

    }
    public static void Poryadok(int[] brray){
        int buf;
        for( int i=0; i < brray.length; i++)
        {
            for (int j = brray.length - 1; j > i; j--)
            {
                if (brray[j-1] < brray[j])
                {
                    buf = brray[j-1];
                    brray[j-1] = brray[j];
                    brray[j] = buf;
                }
            }
        }
        for(int i =0;i<brray.length;i++){
            System.out.println(brray[i]);
        }
    }
}
