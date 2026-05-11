import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toBedroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toBedroom extends Transition
{
    public toBedroom(int width, int height){
       super(width,height);
    
    }
    public void act()
    {
        if (transition()){
        protaPosition=0;
        Greenfoot.setWorld(new Bedroom());
        }
    }
}
