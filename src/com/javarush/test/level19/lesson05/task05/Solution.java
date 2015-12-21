package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
Закрыть потоки ввода-вывода.
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов.
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String text ="";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bufferedReader.readLine());
        FileWriter writer = new FileWriter(bufferedReader.readLine());
//        FileReader reader = new FileReader("C:\\1.txt");
//        FileWriter writer = new FileWriter("C:\\2.txt");
        while(reader.ready())
        {
            while (reader.ready())
            {
                char c = (char) reader.read();
                if (!Pattern.matches("\\p{P}", String.valueOf(c)))
                {
                    writer.write(c);
                }
            }
        }
        writer.close();
        reader.close();
        bufferedReader.close();
    }
}
