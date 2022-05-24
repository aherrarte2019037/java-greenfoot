import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Flecha flecha=new Flecha();
    private int opcion=0;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new playB(), 300,160);
        addObject(new exitB(), 300,230);
        addObject(flecha,205,187);
        
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("UP") &  opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") &  opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion=0;
        if (opcion<=2) opcion=1;
        
        flecha.setLocation(205,187+(opcion*100));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                  case 0:// jugar
                       Greenfoot.setWorld(new MyWorld());
                       break;
                  case 1:// salir
                       Greenfoot.stop();
                       break;
            }        
        }    
    }
}