import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class normalAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class normalAlien extends Enemys
{
    /**
     * Act - do whatever the normalAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
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
