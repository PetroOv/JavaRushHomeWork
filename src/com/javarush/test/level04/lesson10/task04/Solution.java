package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int i =0;
        int j= 0;
        String[][] array = new String[10][10];
        while(j<10){
            array[i][j]="S";
            System.out.print(array[i][j]);
            i++;
            if(i==10){
                i=0;
                j++;
                System.out.println();
            }

        }
    }
}
