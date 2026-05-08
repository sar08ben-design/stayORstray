import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LivingroomDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LivingroomDoor extends Door
{
    
    
    public LivingroomDoor(){
     super();
    }
    
   public void act(){
       if (isTouching(Protagonist.class) &&
            Greenfoot.isKeyDown("e") &&
            doorOpen)
        {
            Greenfoot.setWorld(new Kitchen());
        }
   }
}
