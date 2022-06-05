import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ghostAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ghostAlien extends enemy
{
    /**
     * Act - do whatever the ghostAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ghostAlien(int HP){
        super(HP);
        //this.bullet_angles = bullet_directions(270,0,1,30,1,0);
    }
    public void act()
    {
        setLocation(getX(),getY()+1);
        
        World w = getWorld(); //Generar nuevamente
        if(isAtEdge())
        {
            int x=Greenfoot.getRandomNumber(760);
            //int x= Greenfoot.getRandomNumber(getWidth());
            //w.removeObject(this); Para remover    
            setLocation(x,5);
            //setLocation(getX(),getY());
        }
    }
    
}
