import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play4 extends World
{

    /**
     * Constructor for objects of class play4.
     * 
     */
    public play4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        Greenfoot.playSound("tidid.mp3");
        prepare();
        setBackground("Plevel4.jpg");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        playy4 playy4 = new playy4();
        addObject(playy4,149,297);
        playy4.setLocation(148,297);
    }
}
