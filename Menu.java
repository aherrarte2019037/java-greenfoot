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
        super(768, 600, 1); 
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new playB(),380,225);
        addObject(new exitB(),380,350);
        addObject(flecha,250,220);
        
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("up") &&  opcion!=0) 
        {
            opcion++;
        }
        if (Greenfoot.isKeyDown("down") &&  opcion!=1) 
        {
            opcion--;
        }
        
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        flecha.setLocation(250,220+(opcion*130));
        
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