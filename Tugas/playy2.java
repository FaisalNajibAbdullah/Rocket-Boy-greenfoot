import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playy2 extends Actor
{
    /**
     * Act - do whatever the playy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public playy2(){
        setImage("play1.png");
    }
    boolean mouseDown;
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            mouseDown = true;  
            World world = getWorld();
            world.stopped();
            Greenfoot.setWorld(new level2());
        }else if(Greenfoot.mouseClicked(this)){ 
            mouseDown = false; 
        }
    }    
}
