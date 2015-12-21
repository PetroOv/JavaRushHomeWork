package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int[] array = new int[inputStream.available()];
        int i = 0;
        while(inputStream.available()>0){
            int data = inputStream.read();
            array[i] = data;
            i++;
        }
        inputStream.close();
        int min = array[0];
        for(int j = 1;j < array.length; j++){
             if(min>array[j])
                 min = array[j];
        }
        System.out.println(min);
    }
}
