import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dog_Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money extends Actor
{
    public Money(){
        
        setImage("money.jpg");
        getImage().scale(30, 80);
        
    }
    public void act()
    {
      if (isTouching(Protagonist.class))
        {
            Protagonist.hasMoney = true;
            getWorld().removeObject(this);
        }
    }
}
