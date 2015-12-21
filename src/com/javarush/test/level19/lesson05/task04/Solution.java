package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String text ="";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bufferedReader.readLine());
        FileWriter writer = new FileWriter(bufferedReader.readLine());
//        FileReader reader = new FileReader("C:\\1.txt");
//        FileWriter writer = new FileWriter("C:\\2.txt");
        while(reader.ready()){
            text = text + (char)reader.read();
        }
        String newText = text.replaceAll("\\.","!");
        writer.write(newText);
        writer.close();
        reader.close();
        bufferedReader.close();
    }
}
