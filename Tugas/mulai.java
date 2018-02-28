import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class mulai extends World
{
    GreenfootSound lagu = new GreenfootSound("bs_mulai.mp3");
    public mulai()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
        setBackground("MENU.jpg");
    }

    private void prepare()
    {
        burger burger = new burger();
        addObject(burger,255,335);
        burger burger2 = new burger();
        addObject(burger2,67,245);
        burger2.setLocation(50,241);
        pizza pizza = new pizza();
        addObject(pizza,249,189);
        removeObject(burger2);
        pizza.setLocation(50,239);
        burger burger3 = new burger();
        addObject(burger3,62,375);
        burger3.setLocation(50,375);
        burger.setLocation(239,245);
        pizza pizza2 = new pizza();
        addObject(pizza2,252,372);
        play1 play1 = new play1();
        addObject(play1,159,307);
        play1.setLocation(152,302);
        play1.setLocation(152,301);
        play1.setLocation(152,300);
        play1.setLocation(150,299);
        atom2 atom2 = new atom2();
        addObject(atom2,196,202);
        atom3 atom3 = new atom3();
        addObject(atom3,29,333);
        atom3.setLocation(24,326);
        atom atom = new atom();
        addObject(atom,279,433);
        atom.setLocation(275,436);
        removeObject(pizza2);
        removeObject(burger3);
        atom2.setLocation(241,375);
        atom3.setLocation(53,377);
        atom.setLocation(149,233);
        play1.setLocation(151,357);
        about about = new about();
        addObject(about,157,411);
        about.setLocation(152,406);
        toturial toturial = new toturial();
        addObject(toturial,155,446);
        toturial.setLocation(153,442);
        about.setLocation(152,464);
        toturial.setLocation(151,406);
        about.setLocation(152,439);
        about.setLocation(151,440);
        about.setLocation(152,440);
    }
    
     public void started()
    {
        lagu.playLoop();
    }
    
     public void stopped()
    {
        lagu.stop();   
    }
    
    
}
