import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FakeQuarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FakeQuarter extends Quarter
{

    public FakeQuarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ;
       
       
    }

   public void act() 
    {
        int mouseX, mouseY ;

        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);

            
        } 

    } 

}
