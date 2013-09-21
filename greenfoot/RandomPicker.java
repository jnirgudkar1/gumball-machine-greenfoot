import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /* public RandomPicker()
    {  
    randompicking();
    }*/
    //RandomPicker a=new Alien();
    public void randompicking()//GreenfootImage g)
    {
        GreenfootImage gg=new GreenfootImage("blue-gumball.png");
        gg.scale(50,50);
              //  Greenfoot.delay(20);
        getWorld().getBackground().drawImage(gg,500,500);
    }

    public void act() 
    {
        // Add your action code here.
        //move(-1);
        int mouseX, mouseY ;

        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);

        }
    }

    public void pickRandom()
    {

        if(Greenfoot.getRandomNumber(2)>0)
        {
            RedGumball redball=new RedGumball(); 
            getWorld().addObject(redball,368,463);
            Greenfoot.delay(50);
            getWorld().removeObject(redball);
        }
        else
        {
            BlueGumball blueball=new BlueGumball();
            getWorld().addObject(blueball,368,463);
            Greenfoot.delay(50);
            getWorld().removeObject(blueball);
        }
    }
}

