import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toBasement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toBasement extends Transition
{
    public toBasement(int width, int height){
       super(width,height);
    
    }
    public void act()
    {
        if (transition()){
        
        Greenfoot.setWorld(new Basement());
        }
    }
}
