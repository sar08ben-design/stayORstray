import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rooms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bedroom extends World
{

    /**
     * Constructor for objects of class Rooms.
     * 
     */
    public bedroom()
    {    
        //  a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(269, 378, 1); 
        ;
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Walls walls = new Walls(250, 5);
        addObject(walls,106,134);
        walls.setLocation(140,126);
        walls.setLocation(137,127);
    }
}
