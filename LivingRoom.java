import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LivingRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LivingRoom extends World
{

    /**
     * Constructor for objects of class LivingRoom.
     * 
     */
    public LivingRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 595, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        
        LivingroomDoor livingroomDoor = new LivingroomDoor();
        addObject(livingroomDoor,19,216);
        livingroomDoor.setLocation(25,222);
        livingroomDoor.setLocation(11,235);
        livingroomDoor.setLocation(16,229);
        Protagonist protagonist = new Protagonist();
        addObject(protagonist,57,218);

        Atlas atlas = new Atlas();
        addObject(atlas,249,190);
        toFinalDoor toFinalDoor = new toFinalDoor();
        addObject(toFinalDoor,48,26);
        toFinalDoor.setLocation(46,40);
        toFinalDoor.setLocation(57,47);
        toFinalDoor.setLocation(49,44);
        livingroomDoor.setLocation(15,532);
        toFinalDoor.setLocation(58,75);
        toFinalDoor.setLocation(130,322);
        toFinalDoor.setLocation(117,354);
        toFinalDoor.setLocation(123,101);
    }
}
