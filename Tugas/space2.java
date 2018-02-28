import greenfoot.*; 
 
public class space2 extends World
{
    GreenfootSound lagu = new GreenfootSound("tidid.mp3");
    public space2()
    {    
        super(300, 500, 1); 
         
         setBackground("campu.jpg");
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
