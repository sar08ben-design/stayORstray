import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toLivingR1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toLivingR1 extends toLivingR
{
    public toLivingR1(int width, int height){
       super(width,height);
       changeColor(greenfoot.Color.PINK);
    
    }
    public void act()
    {
        if (transition()){
        protaPosition=1;
        Greenfoot.setWorld(new LivingRoom());
    }// Add your action code here.
    }
}
