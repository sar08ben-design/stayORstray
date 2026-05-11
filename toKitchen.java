import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toKitchen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toKitchen extends Transition
{
    /**
     * Act - do whatever the toKitchen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public toKitchen(int width, int height)
    {
       super (width, height);
       // Add your action code here.
    }
    
    public void act(){
        
    if (transition()){
        protaPosition=0;
        Greenfoot.setWorld(new Kitchen());
    }
    }
}