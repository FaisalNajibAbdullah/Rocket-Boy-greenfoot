import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    GreenfootSound lagu = new GreenfootSound("bg_music.mp3");
    SimpleTimer waktu = new SimpleTimer();
    private boolean g = true;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
        setBackground("langit.jpg");
    }
    
    private void prepare()
    {
        Roket roket = new Roket();
        addObject(roket,150,453);
        roket.turn(-90);
        roket.setLocation(148,437);
        roket.setLocation(148,439);
        waktu.mark();

        roket.setLocation(146,287);
        roket.setLocation(154,430);

        burger burger = new burger();
        addObject(burger,253,75);
        burger burger2 = new burger();
        addObject(burger2,51,83);
        tombol tombol = new tombol();
        addObject(tombol,153,472);
        tombol.setLocation(147,465);
        roket.setLocation(151,377);
    }
    
    //public void started()
    {
        lagu.play();
    }
    
    public void stopped()
    {
        lagu.stop();   
    }
    
    public void act()
    {
        int jml_actor;
        jml_actor = numberOfObjects();
        //showText(""+jml_actor,10,10);
        if(jml_actor==2)
        {
            lubang lubang = new lubang();
            addObject(lubang,147,30);
            lubang.setLocation(148,21);
        } 
        
       if(waktu.millisElapsed()>=3000 && g == true){
        burger burger4 = new burger();
        addObject(burger4,43,172);

        burger burger5 = new burger();
        addObject(burger5,261,73);
        burger burger6 = new burger();
        addObject(burger6,127,47);

        burger5.setLocation(266,49);
        burger6.setLocation(148,45);
        burger4.setLocation(36,61);
        burger4.setLocation(50,58);

        burger burger = new burger();
        addObject(burger,276,324);
        burger burger2 = new burger();
        addObject(burger2,184,213);

        burger burger3 = new burger();
        addObject(burger3,118,300);

        burger2.setLocation(93,34);
        burger.setLocation(217,31);
        burger3.setLocation(271,55);
        burger.setLocation(37,127);
        burger5.setLocation(54,58);
        burger3.setLocation(104,100);
        burger4.setLocation(167,133);
        burger6.setLocation(281,137);
        burger burger7 = new burger();
        addObject(burger7,127,40);
        burger burger8 = new burger();
        addObject(burger8,196,87);
        burger burger9 = new burger();
        addObject(burger9,211,39);
        burger burger10 = new burger();
        addObject(burger10,242,174);
        burger6.setLocation(261,115);
        burger burger11 = new burger();
        addObject(burger11,98,166);
        burger burger12 = new burger();
        addObject(burger12,20,27);
        burger burger13 = new burger();
        addObject(burger13,29,186);
        burger10.setLocation(228,156);
        burger burger14 = new burger();
        addObject(burger14,285,187);
        burger14.setLocation(280,180);
        burger burger15 = new burger();
        addObject(burger15,173,189);
        burger15.setLocation(168,184);
        burger9.setLocation(269,30);
        burger7.setLocation(200,31);
        burger5.setLocation(137,49);
        burger2.setLocation(72,33);
        burger2.setLocation(74,28);
        burger12.setLocation(37,74);
        burger7.setLocation(205,32);
        burger9.setLocation(269,49);  
        g=false;
        
    }
}
}
    

