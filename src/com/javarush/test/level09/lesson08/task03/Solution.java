package com.javarush.test.level09.lesson08.task03;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* Перехват выборочных исключений
1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его - вызвать метод BEAN.log
3. Добавь в сигнатуру метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
4. В методе main обработай оставшееся исключение - логируй его. Используй try..catch

Подсказка:
Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
catch (MyException e) {
throw e;
}
*/

public class Solution {
    /*Решение:
    п1 - хз как разбираться, поэтому начали методом научного тыка.
    Для начала, рулим в метод processExceptions
     */

    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
       /* п4. - в методе майн создаем try..catch
        причем в try мы записываем вызов метода processExceptions();
        а в catch соответсвенно логгирование проброшенного исключения FileSystemException
        */
        try
        {
            processExceptions();
        }
        catch (FileSystemException e){
            BEAN.log(e);
        }

    }

    public static void processExceptions() throws FileSystemException
    /*п.3 - добавить в сигнатуру метода класс исключения
        это выполняется написанием throws FileSystemException
     */

    {

       /* тут добавляем try, в который
       заключаем вызов BEAN.methodThrowExceptions();
        */
        try
        {
            BEAN.methodThrowExceptions();
        }

        /* и создаём первое исключение, то что указано в п.2,1 */
        catch (FileSystemException e){
            BEAN.log(e); //как сказано в задании 2,1 - логгируем
            throw e;     //и перебрасываем бальше 2,1
        }

        // это выполнение пункта 2.2 - обработать CharConversionException
        catch (CharConversionException e){
            BEAN.log(e); //и логгировать его
        }

        // это выполнение пункта 2.2 - обработать IOException
        catch (IOException e){
            BEAN.log(e); //и логгировать его
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
