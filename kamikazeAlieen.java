import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kamikazeAlieen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kamikazeAlieen extends enemy
{
    /**
     * Act - do whatever the kamikazeAlieen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public kamikazeAlieen(int HP, player main_player){
        super(HP, main_player);
        //this.bullet_angles = bullet_directions(270,0,1,30,1,0);
    }
    public void act()
    {
        setLocation(getX(),getY()+4);
        
        World w = getWorld(); //Generar nuevamente
        if(isAtEdge())
        {
            int x= Greenfoot.getRandomNumber(760);
            //w.removeObject(this); Para remover    
            setLocation(x,5);
        }
        receiveDamage(this.main_player.bullets_damage);
    }
}
