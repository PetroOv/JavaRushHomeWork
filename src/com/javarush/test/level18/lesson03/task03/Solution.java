package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        while(inputStream.available()>0){
           Integer data = inputStream.read();
            if(map.containsKey(data)){
                int value = map.get(data);
                map.put(data,value+1);
            }
            else map.put(data,1);
        }
        int maxValue = 1;
        Integer maxKey = 0;
        for(Map.Entry<Integer,Integer>pair: map.entrySet()){
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if(value>maxValue){
                maxValue = value;
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }
}
