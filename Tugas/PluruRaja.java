import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PluruRaja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PluruRaja extends Actor
{
    public double posx,posy,vx,vy,veloc=6;
   
    public PluruRaja()
    {
        
    }
    
    public PluruRaja(int rot)
    {
        
    }
    
    public void addedToWorld(World Latar)
    {
        GreenfootImage image=new GreenfootImage(20,20);
        image.setColor(Color.YELLOW);
        image.drawLine(0,5,image.getWidth()-20,20);
        setImage(image);
        
        posx=getX();
        posy=getY();
        
        vx=veloc;
    }
    
    public void act() 
    {
        posy+=vx;
        posx-=vy;
        
        setLocation((int)posx,(int)posy); 
        if(getY()>=495)
        {
            World world = getWorld();
            world.removeObject(this);
            return;
        }
        {
      Actor pluru;
      pluru = getOneObjectAtOffset(0, 0, Roket.class);
      if(pluru != null)
      {
          World world = getWorld();
          world.removeObject(pluru);
          world.removeObject(this);
          Greenfoot.setWorld(new space2());
          return;
          
      }
    } 
    }
}
