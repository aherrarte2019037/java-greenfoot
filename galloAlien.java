import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class galloAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class galloAlien extends Shooters
{
    /**
     * Act - do whatever the galloAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public galloAlien(int HP){
        super(HP);
        //this.bullet_angles = bullet_directions(270,0,1,30,1,0);
    }
    public void act()
    {
        moveEnemy();
        World w = getWorld();
        if(isAtEdge()) //Generar nuevamente
        {
            int x= Greenfoot.getRandomNumber(760);
            //w.removeObject(this); Para remover    
            setLocation(x,10);
        }
    }
}
