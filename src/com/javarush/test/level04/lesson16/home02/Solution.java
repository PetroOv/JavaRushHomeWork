package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = bf.readLine();
        int num1= Integer.parseInt(sNum1);
        String sNum2 = bf.readLine();
        int num2= Integer.parseInt(sNum2);
        String sNum3 = bf.readLine();
        int num3= Integer.parseInt(sNum3);
        if(((num1<num2)&&(num1>num3))||((num1>num2)&&(num1<num3)))
            System.out.println(num1);
        if(((num2<num1)&&(num2>num3))||((num2>num1)&&(num2<num3)))
            System.out.println(num2);
        if(((num3<num2)&&(num3>num1))||((num3>num2)&&(num3<num1)))
            System.out.println(num3);
    }
}
