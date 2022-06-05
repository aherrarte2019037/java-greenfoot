import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HPBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPBar extends Actor
{
    /**
     * Act - do whatever the HPBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    player main_player;
    int MaxHP;
    public HPBar(player main_player){
        this.main_player = main_player;
        this.MaxHP = this.main_player.HP;
        setImage(new GreenfootImage(100,15));
        getImage().drawRect(0,0, 100, 15);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,this.main_player.HP,13);
        
    }
    
    public void act()
    {
        setImage(new GreenfootImage(100,15));
        getImage().drawRect(0,0, 100, 15);
        set_color();
        int percentage = (this.main_player.HP*100)/this.MaxHP;
        if (percentage <= 0){
            getWorld().removeObject(this);
        }
        else{
            getImage().fillRect(1,1, percentage,13);
            Adjust_Location();            
        }
    }
    public void Adjust_Location(){
        setLocation(this.main_player.getX()-10,this.main_player.getY()+50);
    }
    public void set_color(){
        int percentage = (this.main_player.HP*100)/this.MaxHP;
        if (percentage >= 70){
            getImage().setColor(Color.GREEN);
        }
        else if (percentage >= 30){
            getImage().setColor(Color.ORANGE);
        }
        else if (percentage >= 0){
            getImage().setColor(Color.RED);
        }
    }
}
