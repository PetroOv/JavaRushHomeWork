package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    private String name;
    private int weight;
    private int age;
    private String color;
    private String adress;
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age=age;
        if(weight==0)
            this.weight = 7;
        if(age==0)
            this.age = 5;
    }
    public void initialize(String name,int age){
        this.name = name;
        this.weight = 7;
        this.age=age;
    }
    public void initialize(int age,String color){
        this.age=age;
        this.color=color;
    }
    public void initialize(int weight,int age,String adress){
        this.weight=weight;
        this.age=age;
        this.adress=adress;

    }
}
