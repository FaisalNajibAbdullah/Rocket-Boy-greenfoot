import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play1 extends Actor
{
    /**
     * Act - do whatever the play1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public play1(){
        setImage("play1.png");
    }
    boolean mouseDown;
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            mouseDown = true;  
            World world = getWorld();
            world.stopped();
            Greenfoot.setWorld(new MyWorld());
        }else if(Greenfoot.mouseClicked(this)){ 
            mouseDown = false; 
        }
       
    }    
}
