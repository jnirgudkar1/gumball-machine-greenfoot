import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class ImageLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageLabel extends Actor
{
    /**
     * Act - do whatever the ImageLabel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ImageLabel()
    {
        this("");
    }

    public ImageLabel(String str)
    {   // an image with the text of the String txt, size 20, black text color and transparent background  
        // refer to the documentation for more information about this constructor  
        setLabel(str);         
    }

    public void setLabel(String str)
    {
        setImage(new GreenfootImage(str,20,Color.black,new Color(0,0,0,0)));
          
    }

}
