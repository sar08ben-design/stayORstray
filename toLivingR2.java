import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toLivingR2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toLivingR2 extends toLivingR
{
    public toLivingR2(int width, int height){
       super(width,height);
       changeColor(greenfoot.Color.PINK);
        changeTransparancy(50);
    }
    public void act()
    {
        if (transition()){
        protaPosition=2;
        Greenfoot.setWorld(new LivingRoom());
    }// Add your action code here.
    }
}
