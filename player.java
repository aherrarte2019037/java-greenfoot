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
            shoot(6, 1, 0, 0, "playerBullet.png");
        }
    }
    public void shoot(int bullet_speed, int bullets_per_second, int spin_rate, int spin_shift, String image){
        // DESCRIPTION
        // Method for shooting bullets. For working properly "bullet_direction()" methods must be run
        // on the constructor.
        // PARAMETERS:
        // bullet_speed:        how fast each bullet should fly.
        // bullets_per_second:  Amount of bullets that should be fire per second.
        // spin_rate:           How fast the object will spin. Set 0 to NO spin.
        // spin_shift:          Angle the object will shift for each spin. Set 0 to NO shift.
        
        int fireRate = 60 / bullets_per_second;
        this.bullet_counter++;
        this.spin_counter ++;
        
        // Checking if its time to shoot.
        if (this.bullet_counter > fireRate){
            // Restarting counter.
            this.bullet_counter = 0;
            // instantiating bullets.
            for(int angle : this.bullet_angles){
                getWorld().addObject(new playerBullet(angle, bullet_speed, image), getX(), getY()); 
            }
        }
    }
}
