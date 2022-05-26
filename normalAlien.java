import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class normalAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class normalAlien extends Actor
{
    /**
     * Act - do whatever the normalAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
        move(3);
        World nA=getWorld();
        if(getX()>nA.getWidth()-5||getX()<=5){
        turn(90);}
    }
}
