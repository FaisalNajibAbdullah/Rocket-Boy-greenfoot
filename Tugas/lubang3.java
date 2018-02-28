import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lubang3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lubang3 extends Actor
{
    /**
     * Act - do whatever the lubang3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lubang3(){
        setImage("imag.png");
    }
    public void act() 
    {
        
       setLocation(getX()+Greenfoot.getRandomNumber(2),getY());
        if(getX()>=(getWorld().getWidth()-10))
        {
            setLocation( 0, getY());
        }
        {
            Actor lubang3;
            lubang3 = getOneObjectAtOffset(0, 0, Roket.class);
                if(lubang3 != null)
                {
                    World world = getWorld();
                    world.removeObject(lubang3);
                    world.stopped();
                    Greenfoot.setWorld(new play4());
                }
        }   
    }    
}
