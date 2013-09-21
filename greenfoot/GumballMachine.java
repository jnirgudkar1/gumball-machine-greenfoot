import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class.*;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    static int gumball=10;
    Penny actorpenny;
    Quarter actorquarter;
    FakeQuarter actorfakequarter;
    MouseInfo m=Greenfoot.getMouseInfo();
    Inspector ins;
    Actor tempquarter=null;
    Actor temppenny=null;
    Actor tempfakequarter;
    public GumballMachine(Penny p, Quarter q, FakeQuarter f,Inspector i)
    {
        actorpenny = p;
        actorquarter=q;
        actorfakequarter=f;
        ins=i;
    }
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 400 ) ; 

    }
    public void act() 
    {   int mouseX, mouseY ;
        pennymoved();
        fakequartermoved();       
        quartermoved();
        
    }

    
    
    public void pennymoved()
    {         
        // Actor worldActorpenny;
        //Actor temppenny=null;

        if(Greenfoot.mousePressed(actorpenny))
        { 
            //Actor worldActorpenny = getOneIntersectingObject(Penny.class);  
            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240 && m.getY()<380)
            {

                Actor worldActorpenny= getOneIntersectingObject(Penny.class);  

                if(worldActorpenny!=null)
                {
                    temppenny=worldActorpenny;
                    getWorld().removeObject(worldActorpenny);  
                    getWorld().addObject(new ImageLabel("Penny Moved"), 50,100);  
                    tempfakequarter=null;
                    tempquarter=null;
                    GumballWorld gw = (GumballWorld) getWorld();  
                    Inspector ins = gw.getInspector();
                    ins.hascoin(temppenny,tempquarter,tempfakequarter);
                    temppenny=null;

                    //ins.pennyinworld(temppenny,tempquarter,tempfakequarter);
                }
            }
        }
    }

    void quartermoved()
    {   
        // Actor tempquarter;
        m=Greenfoot.getMouseInfo();
        if(Greenfoot.mousePressed(actorquarter)){

            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240 && m.getY()<380)
            {

                Actor worldqpenny= getOneIntersectingObject(Quarter.class); 
                {  
                    tempquarter=worldqpenny;
                    getWorld().removeObject(worldqpenny);  
                    if(tempquarter!=null){
                        getWorld().addObject(new ImageLabel("Quarter Moved"), 50,200);  
                    }
                    temppenny=null;
                    tempfakequarter=null;
                    GumballWorld gw = (GumballWorld) getWorld();   
                    Inspector ins = gw.getInspector();
                    ins.hascoin(temppenny,tempquarter,tempfakequarter);
                    //ins.quarterinworld(tempquarter,temppenny,tempfakequarter);
                    tempquarter=null;

                }
            }
        }
    }

    void fakequartermoved()
    {    
        m=Greenfoot.getMouseInfo();
        //Actor tempfakequarter;

        if(Greenfoot.mousePressed(actorquarter)){

            if(m.getX()>310 && m.getX()<470 &&  m.getY()>240&& m.getY()<380 )
            {
                Actor worldActor = getOneIntersectingObject(FakeQuarter.class);  
                if (worldActor != null) 
                {
                    tempfakequarter=worldActor;
                    getWorld().removeObject(worldActor);  
                    getWorld().addObject(new ImageLabel("Fake Moved"), 50,300);  
                    GumballWorld gw = (GumballWorld) getWorld();   
                    Inspector ins = gw.getInspector();
                    tempquarter=null;
                    temppenny=null;
                    ins.hascoin(temppenny,tempquarter,tempfakequarter);        
                    // tempfakequarter=null;

                }
            }
        }
    }
}