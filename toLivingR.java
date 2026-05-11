import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toLivingR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toLivingR extends Transition
{
   
   public toLivingR(int width, int height){
       super(width,height);
    
    }
    public void act()
    {
       if (transition()){
        protaPosition=0;
        Greenfoot.setWorld(new LivingRoom());
    } // Add your action code here.
    }
}
