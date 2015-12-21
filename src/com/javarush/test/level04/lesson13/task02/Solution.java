package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sNum1=bf.readLine();
        int num1 = Integer.parseInt(sNum1);
        String sNum2=bf.readLine();
        int num2 = Integer.parseInt(sNum2);
        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                System.out.print("8");
                if(j==num2-1)
                    System.out.println();
            }
        }
    }
}
