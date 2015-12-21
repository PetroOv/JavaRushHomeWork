package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat[] cat = new Cat[10];
        cat[0] = new Cat("Masha");
        cat[1] = new Cat("Sasha");
        cat[2] = new Cat("Nasha");
        cat[3] = new Cat("Washa");
        cat[4] = new Cat("Rasha");
        cat[5] = new Cat("Tasha");
        cat[6] = new Cat("Pasha");
        cat[7] = new Cat("Dasha");
        cat[8] = new Cat("Xasha");
        cat[9] = new Cat("Lasha");
        for(int i =0; i <10; i++){
            map.put(cat[i].getName(),cat[i]);
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();
        for(Map.Entry<String, Cat> pair : map.entrySet()){
            String key = pair.getKey();
            Cat value =  pair.getValue();
            set.add(value);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }
        public String getName(){
            return this.name;
        }


        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
