import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bullet extends Actor
{
    private int direction,speed;
    public Bullet(int rotation)
    {
        direction = rotation; //passing value
        speed = 15;
    }
    public void act() 
    {
        if(IsOutOfRange())
            getWorld().removeObject(this);
        setRotation(direction);
        move(speed);
    }
    private boolean IsOutOfRange()
    {
        if(this.getX() == 999) //World Edge
            return true;
        return false;
    }
}