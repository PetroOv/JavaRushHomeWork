package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human son1 = new Human("Petr",true,18,new ArrayList<Human>());
        Human son2 = new Human("Sanya",true,12,new ArrayList<Human>());
        Human dauther = new Human("Yasya",false,8,new ArrayList<Human>());
        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(son1);
        ch.add(son2);
        ch.add(dauther);
        Human father = new Human("Sanya",true,45,ch);
        Human mother = new Human("Nadya",false,42,ch);
        ArrayList<Human> ch1 = new ArrayList<Human>();
        ch1.add(father);
        ArrayList<Human> ch2 = new ArrayList<Human>();
        ch2.add(mother);
        Human ded1 = new Human("Petr",true,77,ch1);
        Human bab1 = new Human("Valya",false,77,ch1);
        Human ded2 = new Human("Tolya",true,72,ch2);
        Human bab2 = new Human("Vera",false,67,ch2);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(dauther);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(ded1);
        System.out.println(bab1);
        System.out.println(ded2);
        System.out.println(bab2);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        public Human(String name, boolean sex, int age,ArrayList<Human> child){
            this.name = name;
            this.sex = sex;
            this.age = age;
            children = child;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
