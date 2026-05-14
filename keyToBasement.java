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

public class keyToBasement extends dialogueTrigger
{
    
    
    public keyToBasement(int width, int height)
    {
        super(width, height);
        if (Protagonist.playAmmount==0){
            arrayMin = 19;
        arrayMax = 19;
        }
    
        if (Protagonist.playAmmount==1){
            arrayMin = 42;
        arrayMax = 42;
        }
    }
    
    public void act()
    {
       checkTouch();
       if (!Protagonist.dialogueON && Dialogue.currentIndex == 42)
        {
            Protagonist.hasKey = true;
        }
    }
}
