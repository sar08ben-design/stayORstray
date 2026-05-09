import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chair extends Actor
{
    public chair(){
    setImage("top_kitchen_008.png");
    getImage().scale(44, 124);
    }
    public void act()
    {
    Protagonist protagonist = (Protagonist) getOneIntersectingObject(Protagonist.class);
    
    if (protagonist != null)
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3, getY());
        }
    }
    }
}
