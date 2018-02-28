import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class raja extends Actor
{
    int arah = 1;
    int pos = 0;
    private SimpleTimer timer = new SimpleTimer();
    private int freqTembak = 500;
    private int nyawa=7;
    public raja(){
        setImage("pesawat.png");
    }
    public void tembak(int kecepatan){
        if(timer.millisElapsed()>freqTembak){            
            timer.mark();
            freqTembak = (Greenfoot.getRandomNumber(5)+1)*kecepatan;
            getWorld().addObject(new PluruRaja(), getX(), getY());
        }
    }
    
    public boolean cekKena(){
        if(getOneIntersectingObject(pluru.class)!=null){
          
            this.nyawa--;
            
            if(this.nyawa==0){
            
                getWorld().removeObject(this);
                return false;
            }
                      
            return true;
        }    
        return false;
    }
    
    public void act()
    {
        //fire();
        tembak(500);
        
        pos=pos+arah;
        if(pos==0)
        {
            arah=1;
        }
        if(pos==20)
        {
            arah=-1;
        }
       
        //System.out.println(""+pos);
        setLocation(getX()+(arah*Greenfoot.getRandomNumber(6)),getY()+Greenfoot.getRandomNumber(2));
        
        //System.out.println(getWorld().getHeight());
        
        if(getY()>=(getWorld().getHeight()-10))
        {
            setLocation( getX(), 0);
        }
        cekKena();
        
        {
            Actor raja;
            try{
            raja = getOneObjectAtOffset(0, 0, Roket.class);
            
                if(raja != null)
                {
                    World world = getWorld();
                    world.removeObject(this);
                    world.stopped();
                    Greenfoot.setWorld(new space2());
                    return;
                }
            }catch(Exception a){}
        }  
    }
}
