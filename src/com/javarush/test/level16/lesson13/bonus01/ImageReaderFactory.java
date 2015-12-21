package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by petro_000 on 1/27/2015.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes lol){
        ImageReader reader;

        if (lol == ImageTypes.JPG)
        {
            reader = new JpgReader();
        }
        else if (lol == ImageTypes.BMP)
        {
            reader = new BmpReader();
        }
        else if (lol == ImageTypes.PNG)
        {
            reader = new PngReader();
        }
        else
        {
            throw  new  IllegalArgumentException("Неизвестный тип картинки");
        }


        return reader;
    }
}
