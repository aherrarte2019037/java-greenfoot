import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class enemy extends Shooters
{
    player main_player;
    
    public enemy(int HP, player main_player){
        super(HP);
        this.main_player = main_player;
        //this.bullet_angles = bullet_directions(270,0,1,30,1,0);
    }
    
    public void act()
    {
        
    }
    
    public void receiveDamage(int damage_inflicted){
        Actor bullet = getOneIntersectingObject(playerBullet.class);
        if (bullet != null ){
            this.HP -= damage_inflicted;
            getWorld().removeObject(bullet);
        }
        if(this.HP <= 0){
            MyWorld world = (MyWorld) getWorld();
            getWorld().removeObject(bullet);
            world.removeObject(this);
            world.enemies_killed++;
        }
    }
}
