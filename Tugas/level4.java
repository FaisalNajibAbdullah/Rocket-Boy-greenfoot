import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{
    GreenfootSound lagu = new GreenfootSound("lv2.mp3");
    /**
     * Constructor for objects of class level4.
     * 
     */
    public level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
        setBackground("langit3.jpg");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Roket roket = new Roket();
        addObject(roket,151,440);
        roket.turn(-90);
        raja raja = new raja();
        addObject(raja,149,181);
        raja.turn(+90);
        raja.setLocation(144,88);
        raja raja3 = new raja();
        addObject(raja3,63,87);
        raja3.turn(+90);
        raja.setLocation(158,130);
        tombol tombol = new tombol();
        addObject(tombol,153,472);
        tombol.setLocation(148,470);
        tombol.setLocation(148,469);
        roket.setLocation(151,401);
        
    }
    
    //public void started()
    {
        lagu.playLoop();
    }
    
    public void stopped()
    {
        lagu.stop();   
    }
    
    public void act(){
        int jml_actor;
        jml_actor = numberOfObjects();
        //showText(""+jml_actor,10,10);
        if(jml_actor==2)
        {
            lubang4 lubang4 = new lubang4();
            addObject(lubang4,274,31);
            lubang4.setLocation(274,22);
        } 
    }
}
