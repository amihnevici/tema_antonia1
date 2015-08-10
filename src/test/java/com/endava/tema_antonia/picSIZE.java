package com.endava.tema_antonia;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by amihnevici on 7/31/2015.
 */
public class picSIZE {
    @Test
    public void test() throws IOException{
        URL url=new URL("http://img05.deviantart.net/b711/i/2014/100/c/3/death_mask_by_psychopat6666-d7dhsf5.jpg");
        BufferedImage image= ImageIO.read(url);
        System.out.println("Dimensiunile imaginii: "+image.getWidth()+"x"+image.getHeight());
    }
public static void main(String[] args){
    BufferedImage image=null;
    try{
        URL url=new URL("http://img05.deviantart.net/b711/i/2014/100/c/3/death_mask_by_psychopat6666-d7dhsf5.jpg");
        image =ImageIO.read(url);
        ImageIO.write(image, "jpg", new File("C:/Users/death_mask_by_psychopat6666-d7dhsf5.jpg"));

    }
    catch(IOException e){
        e.printStackTrace();
    }
}


}
