import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kitchenDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kitchenDialogue extends showDialogue
{
    public kitchenDialogue(int width, int height){
    
        super (width, height);
        arrayMin=4;
        arrayMax=6;
        
    }
    public void act()
    {
        checkTouch();
        checkQ();
 
    }
}
