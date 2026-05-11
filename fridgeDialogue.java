import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fridgeDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class fridgeDialogue extends showDialogue
{
    public static int touchCount = 0;
    
    public fridgeDialogue(int width, int height)
    {
        super(width, height);
    }
    
    public void act()
    {
        if (isTouching(Protagonist.class))
        {
            if (getWorld().getObjects(InteractPrompt.class)
            .isEmpty())
            {
                getWorld().addObject
                (new InteractPrompt(), getX(), getY() - 40);
            }
            
            if (Greenfoot.isKeyDown("E") && 
            !Protagonist.dialogueON)
            {
                touchCount++;
                
                if (touchCount == 1)
                {
                    arrayMin = 3;
                    arrayMax = 3;
                }
                else if (touchCount == 2)
                {
                    arrayMin = 4;
                    arrayMax = 4;
                }
                else if (touchCount >= 3)
                {
                    arrayMin = 5;
                    arrayMax = 6;
                }
                
                Protagonist.dialogueON = true;
                Dialogue.currentIndex = arrayMin;
            }
        }
        else
        {
            getWorld().removeObjects(getWorld()
            .getObjects(InteractPrompt.class));
        }
        
        checkQ();
    }
}
