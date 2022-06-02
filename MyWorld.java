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
    
    private void crearNormalAliens(int numero){
        for(int i=0;i<numero;i++){
            normalAlien nA=new normalAlien();
            int x= Greenfoot.getRandomNumber(getWidth());
            int y=10;
            addObject(nA,x,y);
        }
    }
    
  
}   

