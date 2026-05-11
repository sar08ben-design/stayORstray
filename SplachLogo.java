import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplachLogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplachLogo extends Actor
{
    /**
     * Act - do whatever the SplachLogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SplachLogo()
    {
        setImage("vanier-college.png");
        GreenfootImage img= getImage();
        img.scale(1200/2,630/2);
    }
}
