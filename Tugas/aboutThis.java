import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aboutThis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aboutThis extends World
{

    /**
     * Constructor for objects of class aboutThis.
     * 
     */
    public aboutThis()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        setBackground("tentang.jpg");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,63,440);
        back.setLocation(52,466);
    }
}
