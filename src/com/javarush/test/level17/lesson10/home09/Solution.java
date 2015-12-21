package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Сигнатуру метода main не менять.  Метод joinData должен вызываться в main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerFirst;
        BufferedReader readerSecond;

        try
        {
            //  читаю в буфер файлы
            readerFirst = new BufferedReader(new FileReader(reader.readLine()));
            readerSecond = new BufferedReader(new FileReader(reader.readLine()));
            String str1;
            String str2;
            // файл переганяю в колекцию
            while ((str1 = readerFirst.readLine()) != null)
            {
                allLines.add(str1);
            }
            while ((str2 = readerSecond.readLine()) != null)
            {
                forRemoveLines.add(str2);
            }
            System.out.println(allLines);
            System.out.println(forRemoveLines);
            try
            {
                // запускаю
                new Solution().joinData();
            }
            catch (CorruptedDataException e){}

        }
        catch (IOException ignore)
        {}

        System.out.println(allLines);
        System.out.println(forRemoveLines);
    }

    public  void joinData () throws CorruptedDataException{
        // если содержитВСЕ строки то удаляем ВСЕСтроки
        if (allLines.containsAll(forRemoveLines))
        {
            allLines.removeAll(forRemoveLines);
            return;
        }
        else {
            // иначе очиста и ошибка
            allLines.clear();
            throw new CorruptedDataException();
        }


    }

}