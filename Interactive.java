import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class interactive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interactive extends CleanScreen
{
   public static boolean promptShowing = false;

    public Interactive(int width, int height)
    {
        super(width, height); 
        changeColor(greenfoot.Color.BLUE);
    }
    
    public void act()
    {
        

        interact();
    }
    public void interact()
    {
          if (isTouching(Protagonist.class) && !Protagonist.dialogueON)
        {
            Greenfoot.setWorld(new Ending1());
            Protagonist.dialogueON = true;
            Dialogue.currentIndex = dialogueTrigger.arrayMin;
        }
    }

}
