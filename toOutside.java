import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toOutside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toOutside extends Transition
{
    public toOutside(int width, int height){
       super(width,height);
    
    }
    public void act()
    {
        if (transition()){
        
        Greenfoot.setWorld(new Outside());
        }
    }
}
