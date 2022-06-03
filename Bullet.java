import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bullet extends Actor
{
    double angle;
    double speed;
    int x_shift;
    int y_shift;

    public Bullet(int angle, int speed, String image){
        this.angle = Math.toRadians(angle);
        if (speed == 1) this.speed = 2;
        else this.speed = speed;
        this.x_shift = (int) Math.round(Math.cos(this.angle) * this.speed);
        this.y_shift = (int) Math.round(Math.sin(this.angle) * this.speed);
        setImage(image);
    }
    public void act()
    {
        fly();
        if (isAtEdge() == true) getWorld().removeObject(this);
    }

    public void rotate(int angle){
        setRotation(angle);
    }
    public void fly(){
        setLocation(getX() + x_shift, getY() - y_shift);
        // "y" is negative since the math.sin function returns a values
        // counting clockwise.
    }
}