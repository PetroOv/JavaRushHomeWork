package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

@SuppressWarnings("Duplicates")
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(args[1]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        String[] words;
        StringBuilder sb = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null)
        {
            words = line.split(" ");
            for (String str :
                    words)
            {
                if (str.length() > 6)
                {
                    sb.append(str);
                    sb.append(",");
//                    bufferedWriter.write(str);
//                    bufferedWriter.write(",");
                }
            }

        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        bufferedWriter.write(sb.toString());
        bufferedWriter.flush();
        fileReader.close();
        fileWriter.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
