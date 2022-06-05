import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends enemy
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boss(int HP, player main_player){
        super(HP, main_player);
        this.bullet_angles = bullet_directions(0,180,2,0,1,0);
    }
    public void act()
    {
        receiveDamage(this.main_player.bullets_damage);
    }
    
    public void receiveDamage(int damage_inflicted){
        shoot(2, 3, 15, 5, "invertBullet.png");
        
        Actor bullet = getOneIntersectingObject(playerBullet.class);
        if (bullet != null ){
            this.HP -= damage_inflicted;
            getWorld().removeObject(bullet);
        }
        if(this.HP <= 0){
            BossLevel world = (BossLevel) getWorld();
            getWorld().removeObject(bullet);
            getWorld().showText("YOU WIN!!!!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            world.removeObject(this);
            Greenfoot.stop();
        }
    }
}
