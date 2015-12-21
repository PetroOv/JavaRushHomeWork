package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread print = new SpecialThread();
        SpecialThread print1 = new SpecialThread();
        SpecialThread print2 = new SpecialThread();
        SpecialThread print3 = new SpecialThread();
        SpecialThread print4 = new SpecialThread();
        Thread printThread = new Thread(print);
        Thread printThread1 = new Thread(print1);
        Thread printThread2 = new Thread(print2);
        Thread printThread3 = new Thread(print3);
        Thread printThread4 = new Thread(print4);

        list.add(printThread);
        list.add(printThread1);
        list.add(printThread2);
        list.add(printThread3);
        list.add(printThread4);


    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
