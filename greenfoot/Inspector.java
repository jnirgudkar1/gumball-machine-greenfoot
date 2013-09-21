import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String s;

    public Inspector()
    {

    }

    public void act() 
    {
        //pennyinworld();
    }  

    public void hascoin(Actor a,Actor b, Actor c)
    {
       
        if(a!=null)
        {
            GreenfootImage drawedImageagain = new GreenfootImage("Pennynotaccepted.png");//the image that is drawed;  
            getWorld().getBackground().drawImage(drawedImageagain, 600, 100); 
            
            GreenfootImage drawedImageagain1 = new GreenfootImage("nogumforpenny.png");//the image that is drawed;  
            getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  

            GreenfootImage pennycoin = new GreenfootImage("pennyfacenew.png");//the image that is drawed;  
            pennycoin.scale(100,100);
            getWorld().getBackground().drawImage(pennycoin, 180, 560);  
        }

        else if(b!=null)
        {
            GreenfootImage drawedImageagain = new GreenfootImage("correctcoin.png");//the image that is drawed;  
            getWorld().getBackground().drawImage(drawedImageagain, 600, 100);  

            GreenfootImage drawedImageagain1 = new GreenfootImage("getyourgums.png");//the image that is drawed;  
            getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  

            GreenfootImage happyface = new GreenfootImage("havegumfacenew.png");//the image that is drawed;  
            happyface.scale(90,90);
            getWorld().getBackground().drawImage(happyface, 180, 560);
            
            if(Greenfoot.getRandomNumber(2)>0)
            {
                GumballWorld gw = (GumballWorld) getWorld();   
                RandomPicker randompicker = gw.getRandomPicker();
                randompicker.pickRandom();

            }
            else
            {
                GumballWorld gw = (GumballWorld) getWorld();   
                GreenPicker greenpicker = gw.getGreenPicker();
                greenpicker.greenPick();
            }
            
        }
         else if(c!=null)
            {
                
                GreenfootImage drawedImageagainfake = new GreenfootImage("fakecoin.png");//the image that is drawed;  
                getWorld().getBackground().drawImage(drawedImageagainfake, 600, 100);  

                GreenfootImage drawedImageagain1fake = new GreenfootImage("fakecoinnogum.png");//the image that is drawed;  
                getWorld().getBackground().drawImage(drawedImageagain1fake, 720, 330);  

                GreenfootImage fakecoin = new GreenfootImage("fakecoinnew.png");//the image that is drawed;  
                fakecoin.scale(90,90);
                getWorld().getBackground().drawImage(fakecoin, 180, 560);

            }

    }

}

/*
public void pennyinworld(Actor a,Actor b, Actor c)
{  
GreenfootImage drawedImageagain = new GreenfootImage("Pennynotaccepted.png");//the image that is drawed;  
getWorld().getBackground().drawImage(drawedImageagain, 600, 100); 

GreenfootImage drawedImageagain1 = new GreenfootImage("nogumforpenny.png");//the image that is drawed;  
getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  

GreenfootImage pennycoin = new GreenfootImage("pennyfacenew.png");//the image that is drawed;  
pennycoin.scale(100,100);
getWorld().getBackground().drawImage(pennycoin, 180, 560);  
}
//        GreenfootImage remove = new GreenfootImage("plain.png");//the image that is drawed;  
//        getWorld().getBackground().drawImage(remove, 820, 670);        

public void quarterinworld(Actor quarter,Actor b, Actor c)
{

GreenfootImage drawedImageagain = new GreenfootImage("correctcoin.png");//the image that is drawed;  
getWorld().getBackground().drawImage(drawedImageagain, 600, 100);  

GreenfootImage drawedImageagain1 = new GreenfootImage("getyourgums.png");//the image that is drawed;  
getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  

GreenfootImage happyface = new GreenfootImage("havegumfacenew.png");//the image that is drawed;  
happyface.scale(90,90);
getWorld().getBackground().drawImage(happyface, 180, 560);
GumballWorld gw = (GumballWorld) getWorld();   
if(Greenfoot.getRandomNumber(2)>0)
{

RandomPicker randompicker = gw.getRandomPicker();
randompicker.pickRandom();

}
else
{
// GumballWorld gw = (GumballWorld) getWorld();   
GreenPicker greenpicker = gw.getGreenPicker();
greenpicker.greenPick();
}
}

public void fakeQuarterinworld(Actor fakequarter,Actor b, Actor c)
{

//getWorld().removeObject(greenpicker);

GreenfootImage drawedImageagain = new GreenfootImage("fakecoin.png");//the image that is drawed;  
getWorld().getBackground().drawImage(drawedImageagain, 600, 100);  

GreenfootImage drawedImageagain1 = new GreenfootImage("fakecoinnogum.png");//the image that is drawed;  
getWorld().getBackground().drawImage(drawedImageagain1, 720, 330);  

GreenfootImage fakecoin = new GreenfootImage("fakecoinnew.png");//the image that is drawed;  
fakecoin.scale(90,90);
getWorld().getBackground().drawImage(fakecoin, 180, 560);

}
}*/