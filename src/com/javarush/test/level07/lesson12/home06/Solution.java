package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new  Human("Petr",true,77,null,null);
        Human ded2 = new  Human("Tolya",true,72,null,null);
        Human bab1 = new  Human("Valya",false,77,null,null);
        Human bab2 = new  Human("Vera",false,67,null,null);
        Human father = new  Human("Sanya",true,45,ded1,bab1);
        Human mother = new  Human("Nadya",false,42,ded2,bab2);
        Human son1 = new  Human("Petr",true,18,father,mother);
        Human son2 = new  Human("Sanya",true,12,father,mother);
        Human son3 = new  Human("Yasya",false,8,father,mother);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);


        //Написать тут ваш код
    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name,boolean sex, int age,Human father, Human mother){
            this.name = name;
            this.sex= sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
