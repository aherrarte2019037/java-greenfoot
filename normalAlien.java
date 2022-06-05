import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class normalAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class normalAlien extends enemy
{
    public normalAlien(int HP){
        super(HP);
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
    }
}
