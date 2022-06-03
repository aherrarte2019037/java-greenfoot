import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class galloAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class galloAlien extends Enemys
{
    /**
     * Act - do whatever the galloAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
