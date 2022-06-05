import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyBullet extends Bullet
{
    /**
     * Act - do whatever the enemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemyBullet(int angle, int speed, String image){
        super(angle, speed, image);
    }
    public void act()
    {
        fly();
        dissapear();
    }
    public void dissapear(){
        if (isAtEdge() == true){
            getWorld().removeObject(this);
        }
    }
}
