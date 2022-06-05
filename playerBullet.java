import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playerBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playerBullet extends Bullet
{
    /**
     * Act - do whatever the playerBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public playerBullet(int angle, int speed, String image){
        super(angle, speed, image);
    }
    public void act()
    {
        fly();
        hurt();
    }
    public void hurt(){
        Actor Shooter;
        Shooter = getOneObjectAtOffset(0,0, enemy.class);
        if (Shooter != null || isAtEdge() == true){
            World world = getWorld();
            world.removeObject(Shooter);
            getWorld().removeObject(this);
        }
    }
}
