package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        Set<String> set = new HashSet<String>();
        Collections.addAll(set, "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        for (int i = 0; i < month.length; i++)
        {
            if (s.equals(month[i]))
                System.out.println(month[i] + " is " + (i+1) + " month");
        }
    }

}
