import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class atom2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class atom2 extends Actor
{
    /**
     * Act - do whatever the atom2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public atom2(){
        setImage("bulan3.png");
    }
    public void act() 
    {
        setLocation(getX(),getY()+Greenfoot.getRandomNumber(9));
        //System.out.println(getWorld().getHeight());
        if(getY()>=(getWorld().getHeight()-10))
        {
            setLocation( getX(), 0);
        }
        {
            Actor atom2;
            atom2 = getOneObjectAtOffset(0, 0, Roket.class);
                if(atom2 != null)
                {
                    World world = getWorld();
                    world.removeObject(atom2);
                    world.stopped();
                    Greenfoot.setWorld(new space2());
                }
        }
    }    
}
