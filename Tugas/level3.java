import greenfoot.*;  

public class level3 extends World
{
    GreenfootSound lagu = new GreenfootSound("bg_music.mp3");
    SimpleTimer waktu = new SimpleTimer();
    private boolean g = true;

    
    public level3()
    {    
        super(300, 500, 1); 
        prepare();
        setBackground("langit2.jpg");
    }
    
    private void prepare()
    {
        Roket roket = new Roket();
        addObject(roket,155,432);
        roket.setLocation(152,433);
        roket.turn(-90);

        atom3 atom3 = new atom3();
        addObject(atom3,34,28);
        atom3 atom32 = new atom3();
        addObject(atom32,273,29);
        atom3 atom33 = new atom3();
        addObject(atom33,101,48);
        atom3 atom34 = new atom3();
        addObject(atom34,207,24);
        atom3 atom35 = new atom3();
        addObject(atom35,59,96);
        atom3 atom36 = new atom3();
        addObject(atom36,163,70);
        atom3 atom37 = new atom3();
        addObject(atom37,150,20);
        atom3 atom38 = new atom3();
        addObject(atom38,261,89);
        atom3 atom39 = new atom3();
        addObject(atom39,228,76);
        atom3 atom310 = new atom3();
        addObject(atom310,122,120);
        atom3 atom311 = new atom3();
        addObject(atom311,233,158);
        atom3 atom312 = new atom3();
        addObject(atom312,182,130);
        atom3 atom313 = new atom3();
        addObject(atom313,50,175);
        atom3 atom314 = new atom3();
        addObject(atom314,132,190);
        atom3 atom315 = new atom3();
        addObject(atom315,252,228);
        atom3 atom316 = new atom3();
        addObject(atom316,203,215);
        atom3 atom317 = new atom3();
        addObject(atom317,95,154);
        atom3 atom318 = new atom3();
        addObject(atom318,238,128);
        atom318.setLocation(228,119);
        atom3 atom319 = new atom3();
        addObject(atom319,183,173);
        atom3 atom320 = new atom3();
        addObject(atom320,280,181);
        atom3 atom321 = new atom3();
        addObject(atom321,39,138);
        atom3 atom322 = new atom3();
        addObject(atom322,31,68);
        atom3 atom323 = new atom3();
        addObject(atom323,77,17);
        atom3 atom324 = new atom3();
        addObject(atom324,122,83);
        atom3 atom325 = new atom3();
        addObject(atom325,97,218);
        atom313.setLocation(37,179);
        atom317.setLocation(76,159);
        atom314.setLocation(112,153);
        atom314.setLocation(129,166);
        atom317.setLocation(79,148);
        atom325.setLocation(126,214);
        atom313.setLocation(62,191);
        atom325.setLocation(163,206);
        atom314.setLocation(152,155);
        atom3 atom326 = new atom3();
        addObject(atom326,109,198);
        tombol tombol2 = new tombol();
        addObject(tombol2,153,472);
        tombol2.setLocation(150,466);
        roket.setLocation(152,392);
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
        boolean i = true;
        //showText(""+jml_actor,10,10);
        if(jml_actor==5 && i == true)
        {
            
        atom3 atom3 = new atom3();
        addObject(atom3,79,245);
        atom atom = new atom();
        addObject(atom,43,175);
        atom2 atom2 = new atom2();
        addObject(atom2,257,274);
        atom2 atom22 = new atom2();
        addObject(atom22,177,153);
        atom2 atom23 = new atom2();
        addObject(atom23,84,93);
        atom2 atom24 = new atom2();
        addObject(atom24,271,33);
        atom2 atom25 = new atom2();
        addObject(atom25,188,69);
        atom2 atom26 = new atom2();
        addObject(atom26,173,238);
        atom2 atom27 = new atom2();
        addObject(atom27,63,41);
        atom2 atom28 = new atom2();
        addObject(atom28,58,296);
        atom2 atom29 = new atom2();
        addObject(atom29,137,41);
        atom3 atom32 = new atom3();
        addObject(atom32,268,129);
        atom3 atom33 = new atom3();
        addObject(atom33,148,89);
        atom3 atom34 = new atom3();
        addObject(atom34,210,26);
        atom3 atom35 = new atom3();
        addObject(atom35,104,27);
        atom3 atom36 = new atom3();
        addObject(atom36,45,80);
        atom atom4 = new atom();
        addObject(atom4,245,70);
        atom atom5 = new atom();
        addObject(atom5,174,35);
        atom atom6 = new atom();
        addObject(atom6,110,67);
        atom atom7 = new atom();
        addObject(atom7,35,30);
        atom2 atom210 = new atom2();
        addObject(atom210,127,166);
        atom3 atom37 = new atom3();
        addObject(atom37,120,133);
        atom atom8 = new atom();
        addObject(atom8,161,131);
        atom atom9 = new atom();
        addObject(atom9,241,172);
        atom2 atom211 = new atom2();
        addObject(atom211,224,121);
        atom3 atom38 = new atom3();
        addObject(atom38,44,141);
        atom2 atom212 = new atom2();
        addObject(atom212,92,175);
        atom3 atom39 = new atom3();
        addObject(atom39,194,117);
        atom3 atom310 = new atom3();
        addObject(atom310,285,80);
        atom atom10 = new atom();
        addObject(atom10,127,203);
        atom atom11 = new atom();
        addObject(atom11,177,192);
        atom atom12 = new atom();
        addObject(atom12,82,134);
        atom atom13 = new atom();
        addObject(atom13,218,156);
        atom2 atom213 = new atom2();
        addObject(atom213,271,205);
        atom atom14 = new atom();
        addObject(atom14,273,245);
        atom3 atom311 = new atom3();
        addObject(atom311,228,218);
        atom3 atom312 = new atom3();
        addObject(atom312,45,222);
        atom atom15 = new atom();
        addObject(atom15,84,215);
        atom atom16 = new atom();
        addObject(atom16,281,171);
        atom3 atom313 = new atom3();
        addObject(atom313,134,242);
        atom313.setLocation(127,239);
        lubang3 lubang3 = new lubang3();
        addObject(lubang3,282,30);
        lubang3.setLocation(275,24);
        i=false;
        } 
        
        if(waktu.millisElapsed()>=7000 && g == true){
            atom2 atom2 = new atom2();
        addObject(atom2,68,48);
        atom2 atom22 = new atom2();
        addObject(atom22,243,48);
        atom2 atom23 = new atom2();
        addObject(atom23,147,61);
        atom2 atom24 = new atom2();
        addObject(atom24,200,38);
        atom2 atom25 = new atom2();
        addObject(atom25,37,131);
        atom2 atom26 = new atom2();
        addObject(atom26,267,138);
        atom2 atom27 = new atom2();
        addObject(atom27,118,35);
        atom2 atom28 = new atom2();
        addObject(atom28,41,90);
        atom2 atom29 = new atom2();
        addObject(atom29,213,119);
        atom2 atom210 = new atom2();
        addObject(atom210,115,125);
        atom2 atom211 = new atom2();
        addObject(atom211,96,95);
        atom211.setLocation(90,85);
        atom2 atom212 = new atom2();
        addObject(atom212,38,37);
        atom212.setLocation(28,30);
        atom2 atom213 = new atom2();
        addObject(atom213,268,95);
        atom213.setLocation(264,88);
        atom27.setLocation(102,28);
        atom27.setLocation(109,24);
        atom2 atom214 = new atom2();
        addObject(atom214,284,32);
        atom2 atom215 = new atom2();
        addObject(atom215,162,25);
        atom2 atom216 = new atom2();
        addObject(atom216,196,80);
        atom2 atom217 = new atom2();
        addObject(atom217,138,95);
        atom2 atom218 = new atom2();
        addObject(atom218,176,110);
        atom2 atom219 = new atom2();
        addObject(atom219,78,118);
        atom2 atom220 = new atom2();
        addObject(atom220,233,83);
        g=false;
    }
}
}
