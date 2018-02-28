import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Roket extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    public Roket(){
        
        setImage("rockett.png");
    }
    public void fire()
    {
        if (timer.millisElapsed() > 500)
        {
        getWorld().addObject(new pluru(getRotation()),getX(),getY());
        timer.mark();
    }
    }
    public void moveUp()
    {
        this.setLocation(this.getX(),this.getY()-2);
    }
    public void moveDown()
    {
        this.setLocation(this.getX(),this.getY()+2);
    }
    public void moveRight()
    {
        this.setLocation(this.getX()+2,this.getY());
    }
    public void moveLeft()
    {
        this.setLocation(this.getX()-2,this.getY());
    }
    public void checkKey() 
    {
         if(Greenfoot.isKeyDown("up"))
        {
            moveUp();
            
        }if(Greenfoot.isKeyDown("Down"))
        {
            moveDown();
           
        }if(Greenfoot.isKeyDown("Right"))
        {
            moveRight();
           
        }if(Greenfoot.isKeyDown("Left"))
        {
            moveLeft();
        }   
        if(Greenfoot.isKeyDown("tembak"))
        {
            fire();
        }
    }
}
