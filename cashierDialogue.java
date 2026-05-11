import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cashierDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cashierDialogue extends showDialogue
{
    /**
     * Act - do whatever the cashierDialogue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  

    public cashierDialogue(int width, int height)
    {
        super(width, height);
    }
    
    public void act()
    {
        if (isTouching(Protagonist.class) && !Protagonist.dialogueON)
        {
            if (Protagonist.hasMoney)
            {
                arrayMin = 9;
                arrayMax = 13;
            }
            else
            {
                arrayMin = 7;
                arrayMax = 8;
            }
            Protagonist.dialogueON = true;
            Dialogue.currentIndex = arrayMin;
        }
        
        checkQ();
    }
}
