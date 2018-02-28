import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pluru extends Actor
{
   public double posx,posy,vx,vy,veloc=6;
   
    public pluru()
    {
        
    }
    
    public pluru(int rot)
    {
        
    }
    
    public void addedToWorld(World Latar)
    {
        GreenfootImage image=new GreenfootImage(20,20);
        image.setColor(Color.WHITE);
        image.drawLine(0,5,image.getWidth()-20,20);
        setImage(image);
        
        posx=getX();
        posy=getY();
        
        vx=veloc;
    }
    
    public void act() 
    {
        posy-=vx;
        posx+=vy;
        
        setLocation((int)posx,(int)posy);
      
    {
      Actor pluru;
      pluru = getOneObjectAtOffset(0, 0, burger.class);
      if(pluru != null)
      {
          World world = getWorld();
          world.removeObject(pluru);
          world.removeObject(this);
          return;
          
      }
    } 
    {
      Actor pizza;
      pizza = getOneObjectAtOffset(0, 0, pizza.class);
      if(pizza != null)
      {
          World world = getWorld();
          world.removeObject(pizza);
          world.removeObject(this);
          return;
      }
    } 
    {
      Actor pluru;
      pluru = getOneObjectAtOffset(0, 0, atom.class);
      if(pluru != null)
      {
          World world = getWorld();
          world.removeObject(pluru);
          world.removeObject(this);
          return;
      }
    }
    {
      Actor pluru;
      pluru = getOneObjectAtOffset(0, 0, atom2.class);
      if(pluru != null)
      {
          World world = getWorld();
          world.removeObject(pluru);
          world.removeObject(this);
          return;
      }
    }
    {
      Actor pluru;
      pluru = getOneObjectAtOffset(0, 0, atom3.class);
      if(pluru != null)
      {
          World world = getWorld();
          world.removeObject(pluru);
          world.removeObject(this);
          return;
      }
    } 
    {
      Actor pluru;
      pluru = getOneObjectAtOffset(0, 0, raja.class);
      if(pluru != null)
      {
          World world = getWorld();
          world.removeObject(this);
          return;
      }
    } 
        if(getY()==0)
        {
            World world = getWorld();
            world.removeObject(this);
        }
    }
}
