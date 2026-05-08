import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toFinalDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toFinalDoor extends Door
{
   
    public toFinalDoor()
    {
        super();// Add your action code here.
    }
    
    public void act(){
        
         if (isTouching(Protagonist.class) &&
            Greenfoot.isKeyDown("e") &&
            doorOpen)
        {
            Greenfoot.setWorld(new finalRoom());
        }
    }
}
