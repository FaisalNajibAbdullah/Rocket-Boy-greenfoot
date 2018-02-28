import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lubang2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lubang2 extends Actor
{
    /**
     * Act - do whatever the lubang2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lubang2(){
        setImage("imag.png");
    }
    public void act() 
    {
        setLocation(getX()+Greenfoot.getRandomNumber(7),getY());
        if(getX()>=(getWorld().getWidth()-10))
        {
            setLocation( 0, getY());
        }
        {
            Actor lubang2;
            lubang2 = getOneObjectAtOffset(0, 0, Roket.class);
                if(lubang2 != null)
                {
                    World world = getWorld();
                    world.removeObject(lubang2);
                    world.stopped();
                    Greenfoot.setWorld(new play3());
                }
        }  
    }    
}
