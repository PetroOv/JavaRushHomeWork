package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private int weight;
        private boolean kids;
        private int power;
        public Human(String name){
            this.name = name;
        }
        public Human(String name,int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, int age, boolean sex,int weight){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }
        public Human(String name, int age, boolean sex,int weight,boolean kids){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.kids = kids;
        }
        public Human(String name, int age, boolean sex,int weight,boolean kids, int power){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.kids = kids;
            this.power = power;
        }
        public Human(String name,  boolean sex){
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, boolean sex,int weight,boolean kids){
            this.name = name;
            this.sex = sex;
            this.weight = weight;
            this.kids = kids;
        }
        public Human(String name, boolean sex,int weight,boolean kids, int power){
            this.name = name;
            this.sex = sex;
            this.weight = weight;
            this.kids = kids;
            this.power = power;
        }
        public Human(String name,boolean kids, int power){
            this.name = name;
            this.kids = kids;
            this.power = power;
        }
    }
}
