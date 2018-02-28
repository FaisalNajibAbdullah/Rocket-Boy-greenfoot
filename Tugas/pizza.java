import greenfoot.*;  

public class pizza extends Actor
{
    public pizza(){
        setImage("bulan4.png");
    }
    public void act() 
    {
        move(10);
        if(Greenfoot.getRandomNumber(20)==4)
        {
            setRotation(Greenfoot.getRandomNumber(360));
        }
        {
            Actor pizza;
            pizza = getOneObjectAtOffset(0, 0, Roket.class);
                if(pizza != null)
                {
                    World world = getWorld();
                    world.removeObject(pizza);
                    world.stopped();
                    Greenfoot.setWorld(new space2());
                }
        }  
    }    
}
