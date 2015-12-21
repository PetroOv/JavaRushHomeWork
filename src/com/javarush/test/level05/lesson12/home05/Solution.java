package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int suma=0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; ; i++){
            String sNum = bf.readLine();
            if(sNum.equals("сумма"))
            {
                System.out.println(suma);
                break;
            }
            else
                suma+=Integer.parseInt(sNum);
        }
    }
}
