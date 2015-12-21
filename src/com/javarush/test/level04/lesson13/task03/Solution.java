package com.javarush.test.level04.lesson13.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
       // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      //  String sNum1=bf.readLine();
        int num1 = 10;
        int num2 = 10;
        for(int i=0;i<num1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("8");
                if(j==i)
                    System.out.println();
            }
        }

    }
}
