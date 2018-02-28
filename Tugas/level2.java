import greenfoot.*;  

public class level2 extends World
{
    GreenfootSound lagu = new GreenfootSound("lv2.mp3");
    public level2()
    {    
        super(300, 500, 1); 
        prepare();
        setBackground("langit4.jpg");
        Greenfoot.setSpeed(90);
        
    }

    private void prepare()
    {
        Roket roket = new Roket();
        addObject(roket,154,439);
        roket.setLocation(148,439);
        roket.turn(-90);
        pizza pizza = new pizza();
        addObject(pizza,235,160);
        pizza pizza2 = new pizza();
        addObject(pizza2,67,234);
        pizza pizza3 = new pizza();
        addObject(pizza3,180,57);
        pizza pizza4 = new pizza();
        addObject(pizza4,75,143);
        pizza4.setLocation(91,146);
        pizza pizza5 = new pizza();
        addObject(pizza5,214,248);
        pizza pizza6 = new pizza();
        addObject(pizza6,55,77);
        pizza4.setLocation(142,157);
        pizza5.setLocation(205,250);
        pizza3.setLocation(183,35);
        pizza2.setLocation(61,284);
        pizza4.setLocation(142,127);
        pizza pizza7 = new pizza();
        addObject(pizza7,70,216);
        pizza5.setLocation(232,344);
        pizza2.setLocation(130,322);
        pizza.setLocation(248,179);
        pizza4.setLocation(163,119);
        pizza2.setLocation(162,243);
        removeObject(pizza5);
        pizza3.setLocation(193,47);
        lubang2 lubang2 = new lubang2();
        addObject(lubang2,280,30);
        lubang2.setLocation(276,22);
        tombol tombol = new tombol();
        addObject(tombol,149,473);
        tombol.setLocation(148,469);
        tombol.setLocation(148,468);
        roket.setLocation(150,383);
    }
    
    public void started()
    {
        lagu.play();
    }
    
    public void stopped()
    {
        lagu.stop();   
    }
    
    public void act()
    {
        lagu.play();
        int jml_actor;
        jml_actor = numberOfObjects();
        //showText(""+jml_actor,10,10);
        if(jml_actor==1)
        {
            Greenfoot.setWorld(new win());
            lagu.stop();
        }
    }
}
