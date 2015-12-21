package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(args[1]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        String[] words;

        while((line = bufferedReader.readLine()) != null){
            words = line.split(" ");
            for (String str :
                    words)
            {
                Pattern p = Pattern.compile("^.*\\d.*$");
                Matcher m = p.matcher(str);
                if(m.matches()){
                    bufferedWriter.write(str);
                    bufferedWriter.write(" ");
                }
            }

        }
        bufferedWriter.flush();
        fileReader.close();
        fileWriter.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
