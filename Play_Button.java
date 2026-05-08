import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play_Button extends Actor
{
  
    public void act()
    {
    if (Greenfoot.mouseClicked(this)){
        startGame();
    }
    }
    public void startGame(){
        Greenfoot.setWorld(new LivingRoom());
    }
}
