import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sinkDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fridgeDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class frideDialogue extends dialogueTrigger
{
    private int myMin = 4;
    private int myMax = 7;
    
    public frideDialogue(int width, int height)
    {
        super(width, height);
        
    }
    
    public void act()
    {
       checkTouch();
       arrayMin = myMin;
        arrayMax = myMax;
    }
}
