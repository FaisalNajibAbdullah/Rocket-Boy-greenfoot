import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toturial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toturial extends Actor
{
    /**
     * Act - do whatever the toturial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public toturial(){
        setImage("toturial.png");
    }
    boolean mouseDown;
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            mouseDown = true;  
            World world = getWorld();
            world.stopped();
            Greenfoot.setWorld(new toturialThis());
        }else if(Greenfoot.mouseClicked(this)){ 
            mouseDown = false; 
        }
    }      
}
