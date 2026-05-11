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
        
         if (promptShowing == true && getWorld().
         getObjects(InteractPrompt.class).isEmpty())
        {
            getWorld().addObject(new InteractPrompt(),
            getX(), getY());
        }
        else if (promptShowing == false)
        {
            getWorld().removeObjects(getWorld().
            getObjects(InteractPrompt.class));
        }
        
    }


}
