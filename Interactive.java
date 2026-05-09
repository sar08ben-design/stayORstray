import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class interactive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interactive extends Walls
{
   private boolean promptShowing = false;

    public Interactive(int width, int height)
    {
        super(width, height); 
    }
    
    public void act()
    {
        
        int w = getWidth();
        int h = getHeight();
         Protagonist protagonist = (Protagonist) getOneObjectAtOffset(0, 0, Protagonist.class);
        if (protagonist == null) protagonist = (Protagonist) getOneObjectAtOffset(-w, 0, Protagonist.class);
        if (protagonist == null) protagonist = (Protagonist) getOneObjectAtOffset(w, 0, Protagonist.class);
        if (protagonist == null) protagonist = (Protagonist) getOneObjectAtOffset(0, -h, Protagonist.class);
        if (protagonist == null) protagonist = (Protagonist) getOneObjectAtOffset(0, h, Protagonist.class);
        
        if (protagonist != null && !promptShowing)
        {
            getWorld().addObject(new InteractPrompt(), getX(), getY() - 40);
            promptShowing = true;
        }
        else if (protagonist == null && promptShowing)
        {
            getWorld().removeObjects(getWorld().getObjects(InteractPrompt.class));
            promptShowing = false;
        }
    }


}
