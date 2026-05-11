import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class firstInteractionDog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class firstInteractionDog extends showDialogue
{
    /**
     * Act - do whatever the firstInteractionDog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public firstInteractionDog(int width, int height){
    
        super (width, height);
        arrayMin=0;
        arrayMax=1;
        
    }
    public void act()
    {
        checkTouch();
        checkQ();
 
    }
}
