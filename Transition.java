import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transition extends CleanScreen
{
    
    public static int protaPosition;
    public Transition (int width, int height)
    {
        super(width, height); 
        changeColor(greenfoot.Color.WHITE);
    }
    
    public void act()
    {
        
        transition();
    }
    
    public boolean transition(){
    
    return isTouching(Protagonist.class);
    }
}
