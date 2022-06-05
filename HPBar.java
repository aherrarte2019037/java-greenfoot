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
    public HPBar(player main_player){
        this.main_player = main_player;
        setImage(new GreenfootImage(100,15));
        getImage().drawRect(0,0, 100, 15);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,this.main_player.HP,13);
        
    }
    
    public void act()
    {
        setImage(new GreenfootImage(100,15));
        getImage().drawRect(0,0, 100, 15);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,this.main_player.HP,13);
    }
}
