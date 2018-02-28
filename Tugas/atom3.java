import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class atom3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class atom3 extends Actor
{
    /**
     * Act - do whatever the atom3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public atom3(){
        setImage("bulan2.png");
    }
    public void act() 
    {
        setLocation(getX(),getY()+Greenfoot.getRandomNumber(8));
        //System.out.println(getWorld().getHeight());
        if(getY()>=(getWorld().getHeight()-10))
        {
            setLocation( getX(), 0);
        }
        {
            Actor atom3;
            atom3 = getOneObjectAtOffset(0, 0, Roket.class);
                if(atom3 != null)
                {
                    World world = getWorld();
                    world.removeObject(atom3);
                    world.stopped();
                    Greenfoot.setWorld(new space2());
                }
        }
    }    
}
