import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class showDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class showDialogue extends CleanScreen
{
    public static int arrayMax;
    public static int arrayMin;
    public showDialogue(int width, int height){
        super (width, height);
        changeColor(greenfoot.Color.YELLOW);
    }
    public void act()
    {
        checkTouch();
        
        checkQ();
    }
    
    public void checkTouch()
    {
         if (isTouching(Protagonist.class))
        {
            Protagonist.dialogueON = true;
            Dialogue.currentIndex = arrayMin;
        }
    }
    
    public void checkQ()
    {
        if (Greenfoot.isKeyDown("q"))
        {
            Protagonist.dialogueON = false;
            getWorld().removeObject(this);
            
            Dialogue dialogue = (Dialogue) getWorld().
            getObjects(Dialogue.class).get(0);
            dialogue.removeDialogue();
        }
    }
}