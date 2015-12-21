package com.javarush.test.level19.lesson10.home06;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Замена чисел
1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно
Например, 0 - "ноль", 1 - "один", 2 - "два"
2. Считать с консоли имя файла
3. Заменить все числа на слова используя словарь map
4. Результат вывести на экран
5. Закрыть потоки. Не использовать try-with-resources

Пример данных:
Это стоит 1 бакс, а вот это - 12 .
Переменная имеет имя file1.
110 - это число.

Пример вывода:
Это стоит один бакс, а вот это - двенадцать .
Переменная имеет имя file1.
110 - это число.
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(12,"двенадцать");
        map.put(11,"одинадцать");
        map.put(10,"десять");
        map.put(9,"девять");
        map.put(8,"восемь");
        map.put(7,"семь");
        map.put(6,"шесть");
        map.put(5,"пять");
        map.put(4,"четыре");
        map.put(3,"три");
        map.put(2,"два");
        map.put(1,"один");
        map.put(0,"ноль");
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
//        String fileName = "C:\\1.txt";

        bufferedReader = new BufferedReader(new FileReader(fileName));

        String line;
        ArrayList<String[]> words = new ArrayList<>();

        while((line = bufferedReader.readLine()) !=null){
            words.add(line.split(" "));
        }
        bufferedReader.close();
        BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < words.size();i++){
            for (int j = 0; j < words.get(i).length; j++)
            {

                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    try {
                        if (Integer.parseInt(words.get(i)[j]) == entry.getKey())
                            words.get(i)[j] = entry.getValue();
                    } catch (NumberFormatException ignored) {
                    }
                }
                bufferedWriter.write(words.get(i)[j]);
                bufferedWriter.write(" ");
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();

        bufferedWriter.close();
    }
}
