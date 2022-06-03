import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kamikazeAlieen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kamikazeAlieen extends Enemys
{
    /**
     * Act - do whatever the kamikazeAlieen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
    }
}
