import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play2 extends World
{

    /**
     * Constructor for objects of class play2.
     * 
     */
    public play2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        Greenfoot.playSound("tidid.mp3");
        prepare();
        setBackground("Plevel2.jpg");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        playy2 playy2 = new playy2();
        addObject(playy2,156,301);
        playy2.setLocation(149,294);
    }
}
