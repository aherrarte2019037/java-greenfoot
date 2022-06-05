import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossLevel extends World
{
    player player = new player(90);
    Boss end_boss = new Boss(1000, player);
    HPBar playerHP = new HPBar(this.player);
    HPBar bossHP = new HPBar(end_boss);
    GreenfootSound BossMusic = new GreenfootSound("Quetzal 1 OST - Boss Theme.mp3");
    
    public BossLevel()
    {    
        super(768, 600, 1);
        prepare();
    }

    private void prepare()
    {
        addObject(player,394,550);
        addObject(playerHP,600,600);
        addObject(end_boss, this.getWidth()/2, this.getHeight()/2);
        addObject(bossHP, 600, 600);
        playBossTheme();
    }
    
    public void playBossTheme(){
        BossMusic.setVolume(50);
        BossMusic.playLoop();
    }
}
