import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gumball extends Actor
{

    public Gumball()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }

    public void act() 
    {move(10);
        turn(90);
        // Add your action code here.
    }    
    public boolean inWorldRange()
    {
        if(getX() > getWorld().getWidth() - 10)
            return true;
        else
            return false;
    }
}
