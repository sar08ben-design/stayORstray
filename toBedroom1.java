import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toBedroom1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toBedroom1 extends toBedroom
{
   public toBedroom1(int width, int height){
       super(width,height);
      changeColor(greenfoot.Color.PINK);
    }
    public void act()
    {
        if (transition()){
        protaPosition=1;
        Greenfoot.setWorld(new Bedroom());
        }// Add your action code here.
    }
}
