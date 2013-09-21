import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenPicker()
    {
        
        
    }
    public void greenPick()
    {   
        GreenGumball greenball=new GreenGumball();    
        getWorld().addObject(greenball, 368,463);
        Greenfoot.delay(50);
        getWorld().removeObject(greenball);
        
           
    }
    public void act() 
    {
        // Add your action code here.
        // void quartermoved()
        //{
        int mouseX, mouseY ;


        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);

        }
    }
}

