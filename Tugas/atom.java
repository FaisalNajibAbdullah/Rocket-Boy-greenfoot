import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class atom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class atom extends Actor
{
    /**
     * Act - do whatever the atom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public atom(){
        setImage("bulan.png");
    }
    public void act() 
    {
        setLocation(getX(),getY()+Greenfoot.getRandomNumber(12));
        //System.out.println(getWorld().getHeight());
        if(getY()>=(getWorld().getHeight()-10))
        {
            setLocation( getX(), 0);
        }
        {
            Actor atom;
            atom = getOneObjectAtOffset(0, 0, Roket.class);
                if(atom != null)
                {
                    World world = getWorld();
                    world.removeObject(atom);
                    world.stopped();
                    Greenfoot.setWorld(new space2());
                }
        }    
    }    
}
