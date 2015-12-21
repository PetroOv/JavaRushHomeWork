package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution
{
    public static List<String> words = new ArrayList<String>();

    static
    {
        words.add("файл");
        words.add("вид");
        words.add("В");
//        words.add("А");
//        words.add("Б");
    }

    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader(args[0]);
//        FileReader fileReader = new FileReader("C:\\1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int count;
        String[] slova;
        Set<String> set = new HashSet<>();
        while ((line = bufferedReader.readLine()) != null){
            count = 0;
            slova = line.split(" ");
            for (String str :
                    slova)
            {
                set.add(str);
            }
            for (String str :
                    set)
            {
                if (words.contains(str))
                    count++;
            }
            if(count == 2){
                System.out.println(line);
            }
        }
        fileReader.close();
        bufferedReader.close();
    }
}
