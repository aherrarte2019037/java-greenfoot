import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Shooters
{
    boolean canFire = true;
    
    public player(int HP){
        super(HP);
        // More information in Shooters class
        this.bullet_angles = bullet_directions(90,0,1,30,1,0);
    }
    public void act()
    {
        setImage("player.png");
        if (getX()>730) setLocation(730, getY());
        if (getX()<54) setLocation(54, getY());
        if (getY()<38) setLocation(getX(), 38);
        if (getY()>550) setLocation(getX(), 550);
        
        if (Greenfoot.isKeyDown("a"))
        {
            setImage("playerLeft.png");
            move(-4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setImage("playerRight.png");
            move(4);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-4);
        }        
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+4);
        }
        if (Greenfoot.isKeyDown("space") && canFire == true)
        {
            // More information in Shooters class
            shoot(6, 5, 0, 0, "playerBullet.png");
        }
    }
}
