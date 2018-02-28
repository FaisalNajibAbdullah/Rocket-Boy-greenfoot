import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol extends Actor
{
    /**
     * Act - do whatever the tombol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public tombol(){
        setImage("tomboll.png");
    }
    public void act() 
    {
        if(Greenfoot.mouseDragged(this) || Greenfoot.mousePressed(this)){
            MouseInfo m = Greenfoot.getMouseInfo();
            int mX = m.getX();
            int mY = m.getY();
                    
            actLoc(mX,mY);
        }
        
    }
    
    public int getWidth2(){    
        return this.getImage().getWidth()/2;
    }
    
    public int getHeight2(){
        return this.getImage().getHeight()/2;
    }
    
    private void actLoc(int px, int py){
        int x;
        int y;
        
        // lokasi pada image
        x = px-(this.getX()-this.getImage().getWidth()/2);
        y = py-(this.getY()-this.getImage().getHeight()/2);
        
        //image Width dibagi 6, dapat per kotak
        //image Height dibagi 1, dapat per kotak
        int imgWp3;
        int imgHp3;
        
        imgWp3 = this.getImage().getWidth()/6;
        imgHp3 = this.getImage().getHeight()/1;
              
        int mx;
        int my;
        
        mx = x/imgWp3;
        my = y/imgHp3;
        
        //System.out.println("mx=" + mx);
        //System.out.println("my=" + my);
        /*
           012345
           
              mx   my
           0 = 0    0
           1 = 1    0
           2 = 2    0
           3 = 3    0
           4 = 4    0
           5 = 5    0
           
           */
          
        if(mx==0 && my==0){
            try{
                ((Roket)getWorld().getObjects(Roket.class).get(0)).moveUp();
            } catch(Exception e){}
        }
        
        if(mx==1 && my==0){
            try{
                ((Roket)getWorld().getObjects(Roket.class).get(0)).moveDown();
            } catch(Exception e){}
        }
        
        if(mx==2 && my==0){
            try{
                ((Roket)getWorld().getObjects(Roket.class).get(0)).fire();
            } catch(Exception e){}
        }
        
        if(mx==3 && my==0){
            try{
                ((Roket)getWorld().getObjects(Roket.class).get(0)).fire();
            } catch(Exception e){}
        }
        
          if(mx==4 && my==0){
            try{
                ((Roket)getWorld().getObjects(Roket.class).get(0)).moveLeft();
            } catch(Exception e){}
        }
        
        if(mx>=5 && my==0){
            try{
                ((Roket)getWorld().getObjects(Roket.class).get(0)).moveRight();
            } catch(Exception e){}
        }
    }
}

