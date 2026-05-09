import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kitchen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kitchen extends World
{
    

    /**
     * Constructor for objects of class Kitchen.
     * 
     */
    public Kitchen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 793, 1); 
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        kitchenDoor kitchenDoor = new kitchenDoor();
        addObject(kitchenDoor,20,101);

        Dog_Food dog_Food = new Dog_Food();
        addObject(dog_Food,41,292);
        dog_Food.setLocation(179,291);
        kitchenDoor.setLocation(49,336);
        kitchenDoor.setLocation(45,333);
        Protagonist protagonist = new Protagonist();
        addObject(protagonist,45,333);
        Interactive interactive = new Interactive(50,50);
        addObject(interactive,171,442);
        chair chair = new chair();
        addObject(chair,314,402);
        chair.setLocation(324,380);
        chair.setLocation(328,376);
        interactive.setLocation(47,304);
        kitchenDoor.setLocation(45,323);
        kitchenDoor.setLocation(48,283);
        interactive.setLocation(42,290);
        kitchenDoor.setLocation(43,376);
        kitchenDoor.setLocation(49,311);
        kitchenDoor.setLocation(49,311);
        kitchenDoor.setLocation(46,311);
    }
}
