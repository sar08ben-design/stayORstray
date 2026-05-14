import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ending1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ending1 extends World
{

    /**
     * Constructor for objects of class Ending1.
     * 
     */
    public Ending1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act(){
    
    if (Dialogue.currentIndex==40){      
        Greenfoot.setWorld(new SplashScreen());
        Protagonist.playAmmount++;
        
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dialogue dialogue = new Dialogue();
        addObject(dialogue,288,289);
        
        
    }
}
