import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class normalAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class normalAlien extends enemy
{
    public normalAlien(int HP, player main_player){
        super(HP, main_player);
        //this.bullet_angles = bullet_directions(270,0,1,30,1,0);
    }
    public void posicionInicial()
    {
        //setRotation(60);
    }
    public void act()
    {
        moveEnemy();
        
        World w = getWorld(); //Generar nuevamente
        if(isAtEdge())
        {
            int x= Greenfoot.getRandomNumber(768);
            //w.removeObject(this); Para remover 
            setLocation(x,10);
        }
        receiveDamage(this.main_player.bullets_damage);
    }
}
