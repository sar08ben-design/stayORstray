import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toKitchen1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toKitchen1 extends toKitchen
{
    public toKitchen1(int width, int height)
    {
       super (width, height);
       changeColor(greenfoot.Color.PINK);
    }
    public void act()
    {
        if (transition()){
        protaPosition=1;
        Greenfoot.setWorld(new Kitchen());
    }// Add your action code here.
    }
}
