import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money extends dialogueTrigger
{
    
    private int myMin = 15;
    private int myMax = 15;
    /**
     * Act - do whatever the Money wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Money(int width, int height)
    {
        super(width, height);
       
    }
    
    public void act()
    {
        checkTouch();
        arrayMin = myMin;
       arrayMax = myMax;
       if (!Protagonist.dialogueON && Dialogue.currentIndex == 15)
        {
            Protagonist.hasMoney = true;
        } // Add your action code here.
    }
}
  

