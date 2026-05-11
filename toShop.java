import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toShop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toShop extends Transition
{
    public toShop(int width, int height){
       super(width,height);
    
    }
    public void act()
    {
        if (transition()){
        
        Greenfoot.setWorld(new Granny());
        }
    }
}
