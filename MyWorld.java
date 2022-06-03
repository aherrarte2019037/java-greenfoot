import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(768, 600, 1);

        prepare();
        crearNormalAliens(5);
        crearKamikazeAlien(3);
        crearInverterAlien(2);
        crearGhostAlien(1);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player player = new player();
        addObject(player,394,550);
    }
    
    private void crearNormalAliens(int numero){ //Generar normal Alien
        for(int i=0;i<numero;i++){
            normalAlien nA=new normalAlien();
            int x= Greenfoot.getRandomNumber(getWidth());
            int y=20;
            addObject(nA,x,y);
        }
    }
    
    private void crearKamikazeAlien(int numero){ //generar kamikaze Alien
        for(int i=0;i<numero;i++){
            kamikazeAlieen kA=new kamikazeAlieen();
            int x= Greenfoot.getRandomNumber(getWidth());
            int y=5;
            addObject(kA,x,y); 
        }
    }
    
    private void crearInverterAlien(int numero){ //generar inverter Alien
        for(int i=0;i<numero;i++){
            inverterAlien iA=new inverterAlien();
            int x= Greenfoot.getRandomNumber(getWidth());
            int y=10;
            addObject(iA,x,y);   
        }
    
    }
    
    private void crearGhostAlien(int numero){ //generar ghost Alien
        for(int i=0;i<numero;i++){
            ghostAlien gA=new ghostAlien();
            int x= Greenfoot.getRandomNumber(getWidth());
            int y=5;
            addObject(gA,x,y); 
        }
    
    }
    
    private void crearGalloAlien(int numero){ //generar gallo Alien
        for(int i=0;i<numero;i++){
            galloAlien galloA=new galloAlien();
            int x= Greenfoot.getRandomNumber(getWidth());
            int y=5;
            addObject(galloA,x,y);
        }
    
    }
}   

