import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toBathroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toBathroom extends Transition
{
    public toBathroom(int width, int height){
       super(width,height);
    
    }
    public void act()
    {
        if (transition()){
        
        Greenfoot.setWorld(new BathR());
        }
    }
}
