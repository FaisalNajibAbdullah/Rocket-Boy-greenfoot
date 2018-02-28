import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toturialThis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toturialThis extends World
{

    /**
     * Constructor for objects of class toturialThis.
     * 
     */
    public toturialThis()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        setBackground("campur.jpg");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,74,416);
        back.setLocation(77,440);
    }
}
