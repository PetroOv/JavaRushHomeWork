package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader reader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(reader);
        TreeMap<String, Double> result = new TreeMap<>();

        String line;
        String[] lineD;
        Double count;
        while((line = bufferedReader.readLine())!= null){
            lineD = line.split(" ");
            if(result.containsKey(lineD[0])){
                count = result.get(lineD[0]);
                result.put(lineD[0],Double.parseDouble(lineD[1]) + count);
            }else{
                result.put(lineD[0], Double.valueOf(lineD[1]));
            }
        }
        reader.close();
        bufferedReader.close();

        double max = 0;

        for (String key : result.keySet()) {
            if(max < result.get(key))
                max = result.get(key);
        }

        for(Map.Entry<String, Double> map : result.entrySet()){
            String key = map.getKey();
            Double value = map.getValue();
            if(value == max)
                System.out.println(key);
        }
    }
}
