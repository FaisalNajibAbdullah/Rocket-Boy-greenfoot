import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class burger extends Actor
{
    public burger(){
        setImage("bulan5.png");
    }
    public void act() 
    {
        
        
        setLocation(getX(),getY()+Greenfoot.getRandomNumber(7));
        //System.out.println(getWorld().getHeight());
        if(getY()>=(getWorld().getHeight()-10))
        {
            setLocation( getX(), 0);
        }
        {
            Actor burger;
            burger = getOneObjectAtOffset(0, 0, Roket.class);
                if(burger != null)
                {
                    World world = getWorld();
                    world.removeObject(burger);
                    world.stopped();
                    Greenfoot.setWorld(new space2());
                }
        }    
      
    }
}
