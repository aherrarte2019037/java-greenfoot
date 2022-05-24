import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getX()>730) setLocation(730, getY());
        if (getX()<54) setLocation(54, getY());
        if (getY()<38) setLocation(getX(), 38);
        if (getY()>550) setLocation(getX(), 550);
        
        if (Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            move(4);
        }

        
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+4);
        }
    }
}
