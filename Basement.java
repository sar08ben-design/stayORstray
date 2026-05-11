import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Basement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basement extends World
{

    /**
     * Constructor for objects of class Basement.
     * 
     */
    public Basement()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        toKitchen1 toKitchen1 = new toKitchen1(100, 15);
        addObject(toKitchen1,560,27);
        toKitchen1.setLocation(568,15);
        toKitchen1.setLocation(552,14);
        Protagonist protagonist = new Protagonist();
        addObject(protagonist,554,92);
        toKitchen1.setLocation(587,-5);
        toKitchen1.setLocation(582,-3);
        toKitchen1.setLocation(566,-1);
        toKitchen1.setLocation(571,-7);
        toKitchen1.setLocation(570,-1);
    }
}
